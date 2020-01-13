package com.limpid.service_ribbon.service.impl;

import com.limpid.service_ribbon.service.HelloService;
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
    public String hiService() {
        return restTemplate.getForObject("http://service-li/hello/world", String.class);
    }
}
