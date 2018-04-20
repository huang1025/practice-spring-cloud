package com.huang.service.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by huang_jiangling on 2018/4/14.
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "filter", method = RequestMethod.GET)
    public String filter() {
        return "consumer:filter";
    }

    @RequestMapping(value = "consumerHello", method = RequestMethod.GET)
    public String consumerHello() {
        String body = restTemplate.getForEntity("http://service-hello:8080/hello", String.class).getBody();
        return "consumerHello(" + body + ")";
    }

    @RequestMapping(value = "consumerHelloForHystrix", method = RequestMethod.GET)
    public String consumerHelloForHystrix() {
        String body = restTemplate.getForEntity("http://service-hello/helloForHystrix", String.class).getBody();
        return "consumerHelloForHystrix(" + body + ")";
    }
}
