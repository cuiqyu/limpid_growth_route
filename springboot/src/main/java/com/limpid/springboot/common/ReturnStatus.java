package com.limpid.springboot.common;

import lombok.Getter;

/**
 * 返回状态
 *
 * @auther cuiqiongyu
 * @create 2020/1/9 15:59
 */
@Getter
public enum ReturnStatus {

    /**
     * 操作成功
     */
    OK(200, "操作成功"),

    /**
     * 未知异常
     */
    UNKNOWN_ERROR(500, "服务器出错啦");

    /**
     * 状态码
     */
    private Integer code;
    /**
     * 内容
     */
    private String message;

    ReturnStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
