package com.wust.spring.boot.standard.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String tets(HttpServletRequest httpServletRequest) {
        httpServletRequest.getParameterMap();
        System.out.println("Hello controller ...");
        return "20190520 Hello World";
    }

}
