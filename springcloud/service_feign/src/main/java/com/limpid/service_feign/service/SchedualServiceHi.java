package com.limpid.service_feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @auther cuiqiongyu
 * @create 2020/1/13 16:46
 */
@FeignClient(value = "service-li", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hello/world", method = RequestMethod.GET)
    String sayHelloWorld();

}
