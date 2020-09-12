package com.wust.spring.boot.standard.demo.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

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
        return new HikariDataSource(config);
    }

    @Bean
    public SpringLiquibase iamLiquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(liquibaseDataSource());
        liquibase.setChangeLog("classpath:user-changelog.xml");
        liquibase.setContexts("development,test,production");
        liquibase.setShouldRun(true);
        return liquibase;
    }

}
