package com.account.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.account"})
@EnableEurekaClient
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
