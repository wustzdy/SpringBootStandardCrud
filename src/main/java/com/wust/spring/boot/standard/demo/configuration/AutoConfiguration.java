package com.wust.spring.boot.standard.demo.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.Connection;

@Configuration
@EnableConfigurationProperties({IamLiquibaseDataSourceProperties.class})
public class AutoConfiguration {
    @Autowired
    private IamLiquibaseDataSourceProperties liquibaseDataSourceProperties;

    private DataSource liquibaseDataSource() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(liquibaseDataSourceProperties.getDriver());
        config.setJdbcUrl(liquibaseDataSourceProperties.getUrl());
        config.setUsername(liquibaseDataSourceProperties.getUserName());
        config.setPassword(liquibaseDataSourceProperties.getPassword());
        config.setConnectionTestQuery("SELECT 1");
        config.setMaximumPoolSize(liquibaseDataSourceProperties.getMaxPoolSize());
        config.setConnectionTimeout(liquibaseDataSourceProperties.getConnectionTimeout());
        config.setMaxLifetime(liquibaseDataSourceProperties.getMaxLifetime());
        DataSource dataSource = new HikariDataSource(config);
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("连接>>>>>>>>>" + connection);
            System.out.println("连接地址>>>>>" + connection.getMetaData().getURL());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return new HikariDataSource(config);
    }

    @Bean
    public SpringLiquibase iamLiquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        try {
            liquibase.setDataSource(liquibaseDataSource());
            System.out.println("1111111111");
            liquibase.setChangeLog("classpath:iam-changelog.xml");
            liquibase.setContexts("development,test,production");
            liquibase.setShouldRun(true);
            liquibase.setResourceLoader(new DefaultResourceLoader());
            System.out.println("22222");
            System.out.println("liquibase" + liquibase);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liquibase;
    }
}
