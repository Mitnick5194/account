package com.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Eureka注册中心测试入口
 */
@RestController
public class TestController {

    @GetMapping("/actuator/info")
    public String test() {
        return "account测试成功";
    }
}
