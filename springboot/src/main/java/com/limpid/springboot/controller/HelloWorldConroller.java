package com.limpid.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther cuiqiongyu
 * @create 2020/1/9 15:03
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloWorldConroller {

    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

}
