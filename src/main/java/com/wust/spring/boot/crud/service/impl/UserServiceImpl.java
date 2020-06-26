package com.wust.spring.boot.crud.service.impl;

import com.wust.spring.boot.crud.entity.UserEntity;
import com.wust.spring.boot.crud.mapper.UserMapper;
import com.wust.spring.boot.crud.model.User;
import com.wust.spring.boot.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = true)
    private UserMapper userMapper;

    @Override
    public Integer createUser(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(user.getUserName());
        userEntity.setBirthday(user.getBirthday());
        userEntity.setGender(user.getGender());

        return userMapper.insert(userEntity);
    }
}
