package com.wust.spring.boot.standard.demo.service;


import com.wust.spring.boot.standard.demo.model.User;

public interface UserService {
    User addUser(User user);

    User getUser(String userName);
}
