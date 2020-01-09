package com.limpid.springboot.event;

import lombok.Data;

/**
 * 用户注册事件
 *
 * @auther cuiqiongyu
 * @create 2020/1/9 13:42
 */
@Data
public class UserRegisterEvent extends AbstractEvent {

    private String userId;
    private String userName;

    public UserRegisterEvent(Object source) {
        super(source);
    }

    public UserRegisterEvent(Object source, String userId, String userName) {
        super(source);
        this.userId = userId;
        this.userName = userName;
    }

}
