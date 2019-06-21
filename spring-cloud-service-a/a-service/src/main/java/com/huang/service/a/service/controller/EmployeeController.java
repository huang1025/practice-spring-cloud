package com.huang.service.a.service.controller;

import com.huang.service.a.service.serviceOfCloud.ConsumerEmployeeService;
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
        return "serviceOfCloud-a->consumerEmployee/list:(" + employeeService.list() + ")";
    }
}
