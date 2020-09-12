package com.wust.spring.boot.standard.demo.controller;

import com.wust.spring.boot.standard.demo.model.Tenant;
import com.wust.spring.boot.standard.demo.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("zdy/tenant")
public class TenantController {

    @Autowired
    private TenantService tenantService;

    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public String getTest() {
        return "helloService.getTest()";
    }

    @RequestMapping(value = "/createTenant", method = RequestMethod.POST)
    public Tenant createUser(@RequestBody Tenant tenant) {
        return tenantService.addTenant(tenant);
    }

    @RequestMapping(value = "/getTenant", method = RequestMethod.GET)
    public Tenant getUsers(@RequestParam String tenantName) {
        return tenantService.getTenant(tenantName);
    }
}
