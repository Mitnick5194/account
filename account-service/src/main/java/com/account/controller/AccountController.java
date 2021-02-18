package com.account.controller;

import com.account.rest.AccountRestApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController implements AccountRestApi {
    public AccountController(){
        System.out.println("asdfd");
    }
    @GetMapping("/hello")
    @Override
    public String hello() {
        return "hello account";
    }
}
