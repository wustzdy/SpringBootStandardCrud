package com.wust.spring.boot.standard.demo.model;

import com.wust.spring.boot.standard.demo.contant.TenantStatus;
import lombok.Data;

@Data
public class Tenant {
    private String name;
    private String description;
    private TenantStatus status;
}
