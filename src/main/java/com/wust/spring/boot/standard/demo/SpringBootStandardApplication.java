package com.wust.spring.boot.standard.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.wust.spring.boot.standard.demo.mapper")
public class SpringBootStandardApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStandardApplication.class, args);
    }
}
