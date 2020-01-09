package com.limpid.springboot.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件抽象类
 *
 * @auther cuiqiongyu
 * @create 2020/1/9 14:27
 */
public abstract class AbstractEvent extends ApplicationEvent {

    public AbstractEvent(Object source) {
        super(source);
    }
    
}
