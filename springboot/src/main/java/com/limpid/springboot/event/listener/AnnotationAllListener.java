package com.limpid.springboot.event.listener;

import com.limpid.springboot.event.AbstractEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 注解的方式监听所有的事件
 *
 * @auther cuiqiongyu
 * @create 2020/1/9 14:14
 */
@Component
public class AnnotationAllListener {

    @EventListener
    public void eventListener(AbstractEvent event) {
        String simpleName = event.getClass().getSimpleName();
        switch (simpleName) {
            case "UserRegisterEvent":
                System.out.println("接受到用户注册事件：" + event.toString());
                break;
            default:
                break;
        }
    }

}
