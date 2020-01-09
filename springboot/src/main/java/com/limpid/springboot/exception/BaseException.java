package com.limpid.springboot.exception;

import com.limpid.springboot.common.ReturnStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 自定义异常基类
 *
 * @auther cuiqiongyu
 * @create 2020/1/9 15:58
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseException extends RuntimeException {

    private Integer code;
    private String message;

    public BaseException(ReturnStatus status) {
        super(status.getMessage());
        this.code = status.getCode();
        this.message = status.getMessage();
    }

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

}
