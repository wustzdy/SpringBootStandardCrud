package com.wust.spring.boot.crud.controller;

import com.wust.spring.boot.crud.model.User;
import com.wust.spring.boot.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addBluetooth", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Integer add(@RequestBody User user) {
        if (userService.createUser(user) != 1) {
            System.out.println("数据库插入数据成功！");
        }
        return null;
    }
}
