package com.wust.spring.boot.crud.service;

import com.wust.spring.boot.crud.entity.UserEntity;
import com.wust.spring.boot.crud.model.User;

public interface UserService {
    Integer createUser(User user);
}
