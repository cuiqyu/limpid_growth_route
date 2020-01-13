package com.limpid.service_ribbon.controller;

import com.limpid.service_ribbon.service.HelloService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther cuiqiongyu
 * @create 2020/1/13 16:03
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.hiService();
    }

}
