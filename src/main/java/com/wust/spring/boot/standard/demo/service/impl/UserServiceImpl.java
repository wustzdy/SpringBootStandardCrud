package com.wust.spring.boot.standard.demo.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.wust.spring.boot.standard.demo.entity.UserEntity;
import com.wust.spring.boot.standard.demo.mapper.UserMapper;
import com.wust.spring.boot.standard.demo.model.User;
import com.wust.spring.boot.standard.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Slf4j
@Component
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User addUser(User user) {
        log.info("创建user请求参数user：. user=[{}]", JSONArray.toJSON(user));
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        if (userMapper.insert(userEntity) != 1) {
            throw new RuntimeException("error");
        }
        User user1 = new User();
        BeanUtils.copyProperties(userEntity, user1);
        log.info("创建user返回参数user1：. user1=[{}]", JSONArray.toJSON(user1));
        return user1;
    }

    @Override
    public User getUser(String userName) {
        UserEntity userEntity = userMapper.selectByName(userName);
        User user = new User();
        BeanUtils.copyProperties(userEntity, user);
        return user;
    }
}
