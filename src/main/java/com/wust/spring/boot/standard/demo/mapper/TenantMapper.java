package com.wust.spring.boot.standard.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wust.spring.boot.standard.demo.entity.TenantEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface TenantMapper extends BaseMapper<TenantEntity> {
    @Select("SELECT * FROM " + TenantEntity.TABLE_NAME + " WHERE name=#{TenantName} ")
    TenantEntity selectByName(@Param("TenantName") String TenantName);
}
