package com.wust.spring.boot.standard.demo;


import com.wust.spring.boot.standard.demo.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(value = "com.wust.spring.boot.standard.demo.mapper.*Mapper")
@ComponentScan("com.wust.spring.boot.standard.demo.*")
public class SpringBootStandardApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStandardApplication.class, args);
    }
}
