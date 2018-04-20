package com.huang.service.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huang_jiangling on 2018/4/20.
 */
@RequestMapping("/employee")
public interface EmployeeService {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String list();

}
