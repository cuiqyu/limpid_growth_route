package com.limpid.service_feign.service;

import org.springframework.stereotype.Component;

/**
 * @auther cuiqiongyu
 * @create 2020/1/14 13:57
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHelloWorld() {
        return "sorry error";
    }

}
