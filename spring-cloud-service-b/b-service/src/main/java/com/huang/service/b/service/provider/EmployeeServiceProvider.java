package com.huang.service.b.service.provider;

import com.huang.service.b.api.service.BEmployeeService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huang_jiangling on 2018/4/20.
 */
@RestController
public class EmployeeServiceProvider implements BEmployeeService {

    @Override
    public String list() {
        return "EmployeeServiceProvider:1-2-3-4-5";
    }
}
