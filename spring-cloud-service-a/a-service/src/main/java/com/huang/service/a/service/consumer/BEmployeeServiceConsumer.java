package com.huang.service.a.service.consumer;

import com.huang.service.b.api.service.BEmployeeService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by huang_jiangling on 2018/4/20.
 */
@FeignClient("service-b")
public interface BEmployeeServiceConsumer extends BEmployeeService {
}
