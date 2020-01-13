package com.limpid.feign.controller;

import com.limpid.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther cuiqiongyu
 * @create 2020/1/13 16:49
 */
@RestController
public class HelloWorldController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return schedualServiceHi.sayHelloWorld();
    }

}
