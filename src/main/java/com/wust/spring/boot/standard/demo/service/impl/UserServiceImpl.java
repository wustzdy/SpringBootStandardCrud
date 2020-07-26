package com.wust.spring.boot.standard.demo.service.impl;

import com.wust.spring.boot.standard.demo.contant.UserGenderType;
import com.wust.spring.boot.standard.demo.entity.UserEntity;
import com.wust.spring.boot.standard.demo.mapper.UserMapper;
import com.wust.spring.boot.standard.demo.model.User;
import com.wust.spring.boot.standard.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@SuppressWarnings("all")
@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = true)
    private UserMapper userMapper;

    @Override
    public Integer createUser(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(user.getUserName());
        userEntity.setBirthday(new Date());
        userEntity.setGender(UserGenderType.FEMALE);
        userEntity.setId(1000l);

        return userMapper.insert(userEntity);
    }
}
