package com.wust.spring.boot.standard.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wust.spring.boot.standard.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface  UserMapper extends BaseMapper<UserEntity> {
    @Select("select * from " + UserEntity.TABLE_NAME + " WHERE owned_by_id=#{ownerId}")
    UserEntity findByOwnerId(@Param("ownerId") long ownerId);
}
