package com.limpid.springboot.exception;

import com.limpid.springboot.common.ReturnStatus;
import lombok.Getter;

/**
 * 页面异常
 *
 * @auther cuiqiongyu
 * @create 2020/1/9 16:00
 */
@Getter
public class PageException extends BaseException {

    public PageException(ReturnStatus status) {
        super(status);
    }

    public PageException(Integer code, String message) {
        super(code, message);
    }

}