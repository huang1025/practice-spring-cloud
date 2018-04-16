package com.huang.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by huang_jiangling on 2018/4/14.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppConfigForServiceProvider {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigForServiceProvider.class, args);
    }
}
