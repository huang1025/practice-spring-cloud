package com.huang.service.b.service.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * Created by huang_jiangling on 2018/4/14.
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        List<String> services = discoveryClient.getServices();
        for (String each : services) {
            System.out.println("==============");
            System.out.println("serviceOfCloud: " + each);
        }
        return "serviceOfCloud b of hello;";
    }

    @RequestMapping(value = "/helloForHystrix")
    @HystrixCommand(fallbackMethod = "hehe")
    public String helloForHystrix() throws InterruptedException {
        int num = new Random().nextInt(5);
        System.out.println(num);
        Thread.currentThread().sleep(num * 1000);
        return "serviceOfCloud-providor:helloForHystrix";
    }

    public String hehe() {
        return "hehe:error";
    }
}
