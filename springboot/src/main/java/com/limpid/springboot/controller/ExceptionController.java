package com.limpid.springboot.controller;

import com.limpid.springboot.common.ReturnStatus;
import com.limpid.springboot.exception.JsonException;
import com.limpid.springboot.exception.PageException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 异常处理测试controller
 *
 * @auther cuiqiongyu
 * @create 2020/1/9 16:03
 */
@RestController
@RequestMapping(value = "/exception")
public class ExceptionController {

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public String jsonException() {
        throw new JsonException(ReturnStatus.UNKNOWN_ERROR);
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String pageException() {
        throw new PageException(ReturnStatus.UNKNOWN_ERROR);
    }

}
