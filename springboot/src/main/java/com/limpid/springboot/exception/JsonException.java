package com.limpid.springboot.exception;

import com.limpid.springboot.common.ReturnStatus;
import lombok.Getter;

/**
 * json异常
 *
 * @auther cuiqiongyu
 * @create 2020/1/9 16:00
 */
@Getter
public class JsonException extends BaseException {

    public JsonException(ReturnStatus status) {
        super(status);
    }

    public JsonException(Integer code, String message) {
        super(code, message);
    }

}