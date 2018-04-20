package com.huang.service.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huang_jiangling on 2018/4/20.
 */
@RestController
@RequestMapping("consumerEmployee")
public class EmployeeController {

    @Autowired
    private ConsumerEmployeeService employeeService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list() {
        return "service-consumer->consumerEmployee/list:(" + employeeService.list() + ")";
    }
}
