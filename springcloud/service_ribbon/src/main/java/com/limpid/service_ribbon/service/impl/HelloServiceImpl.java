package com.limpid.service_ribbon.service.impl;

import com.limpid.service_ribbon.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @auther cuiqiongyu
 * @create 2020/1/13 16:01
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService() {
        return restTemplate.getForObject("http://service-li/hello/world", String.class);
    }

    public String hiError() {
        return "hi, sorry error";
    }

}
