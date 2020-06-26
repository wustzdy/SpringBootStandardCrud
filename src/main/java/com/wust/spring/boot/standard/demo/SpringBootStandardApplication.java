package com.wust.spring.boot.standard.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@MapperScan("com.wust.spring.boot.standard.demo.mapper")
public class SpringBootStandardApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStandardApplication.class, args);
    }
}
