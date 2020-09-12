package com.wust.spring.boot.standard.demo.controller;

import com.wust.spring.boot.standard.demo.model.User;
import com.wust.spring.boot.standard.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("zdy/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public String getTest() {
        return "helloService.getTest()";
    }

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUsers(@RequestParam String userName) {
        return userService.getUser(userName);
    }
}
