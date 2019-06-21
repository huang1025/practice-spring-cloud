package com.huang.service.b.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by huang_jiangling on 2018/4/14.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class AppConfigForServiceB {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigForServiceB.class, args);
    }
}
