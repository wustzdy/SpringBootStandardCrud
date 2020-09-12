package com.wust.spring.boot.standard.demo.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.wust.spring.boot.standard.demo.entity.TenantEntity;
import com.wust.spring.boot.standard.demo.mapper.TenantMapper;
import com.wust.spring.boot.standard.demo.model.Tenant;
import com.wust.spring.boot.standard.demo.service.TenantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Slf4j
@Component
public class TenantServiceImpl implements TenantService {
    @Resource
    private TenantMapper tenantMapper;

    @Override
    public Tenant addTenant(Tenant tenant) {
        log.info("创建tenant请求参数tenant：. user=[{}]", JSONArray.toJSON(tenant));
        TenantEntity tenantEntity = new TenantEntity();
        BeanUtils.copyProperties(tenant, tenantEntity);
        if (tenantMapper.insert(tenantEntity) != 1) {
            throw new RuntimeException("error");
        }
        Tenant tenant1 = new Tenant();
        BeanUtils.copyProperties(tenantEntity, tenant1);
        log.info("创建tenant返回参数tenant1：. tenant1=[{}]", JSONArray.toJSON(tenant1));
        return tenant1;
    }

    @Override
    public Tenant getTenant(String tenantName) {
        TenantEntity tenantEntity = tenantMapper.selectByName(tenantName);
        Tenant tenant = new Tenant();
        BeanUtils.copyProperties(tenantEntity, tenant);
        return tenant;
    }
}
