package com.wust.spring.boot.standard.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wust.spring.boot.standard.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper extends BaseMapper<UserEntity> {
    @Select("SELECT * FROM " + UserEntity.TABLE_NAME + " WHERE user_name=#{UserName} ")
    UserEntity selectByName(@Param("UserName") String UserName);
}
