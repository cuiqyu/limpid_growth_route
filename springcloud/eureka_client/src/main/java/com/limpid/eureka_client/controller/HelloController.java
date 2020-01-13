package com.limpid.eureka_client.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello
 *
 * @auther cuiqiongyu
 * @create 2020/1/13 15:32
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/world")
    public String world() {
        return "hello world, i'm a " + port;
    }


}
