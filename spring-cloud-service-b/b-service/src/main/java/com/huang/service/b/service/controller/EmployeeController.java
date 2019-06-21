package com.huang.service.b.service.controller;

import com.huang.service.api.EmployeeService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huang_jiangling on 2018/4/20.
 */
@RestController
public class EmployeeController implements EmployeeService {

    @Override
    public String list() {
        return "serviceProvider:1-2-3-4-5";
    }
}
