package com.huang.service.b.api.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * BEmployeeService - BEmployeeService
 *
 * @author: huang_jiangling
 * @date: 2019-06-21
 **/
@RequestMapping("/b_employee")
public interface BEmployeeService {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    String list();
}
