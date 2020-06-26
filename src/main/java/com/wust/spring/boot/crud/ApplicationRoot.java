package com.wust.spring.boot.crud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.wust.spring.boot.crud.mapper")
public class ApplicationRoot {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRoot.class, args);
    }
}
