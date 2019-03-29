package com.huang.service.consumer.serviceOfCloud;

import com.huang.service.api.EmployeeService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by huang_jiangling on 2018/4/20.
 */
@FeignClient("service-hello")
public interface ConsumerEmployeeService extends EmployeeService {
}
