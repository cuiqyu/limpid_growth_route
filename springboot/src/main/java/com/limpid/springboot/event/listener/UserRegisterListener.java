package com.limpid.springboot.event.listener;

import com.limpid.springboot.event.UserRegisterEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 用户注册事件监听
 *
 * @auther cuiqiongyu
 * @create 2020/1/9 14:04
 */
@Component
public class UserRegisterListener implements ApplicationListener<UserRegisterEvent> {

    @Async
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        System.out.println("接受到用户注册事件--：" + userRegisterEvent.toString());
    }

}
