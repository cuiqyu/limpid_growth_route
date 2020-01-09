package com.limpid.springboot.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * 自定义事件发送
 *
 * @auther cuiqiongyu
 * @create 2020/1/9 13:39
 */
@Component
public class CustomerApplicationEventPublisher implements ApplicationEventPublisher, ApplicationContextAware {

    private ApplicationContext applicationContext;

    /**
     * @see org.springframework.context.ApplicationEventPublisher#publishEvent(org.springframework.context.ApplicationEvent)
     */
    @Override
    public void publishEvent(ApplicationEvent event) {
        applicationContext.publishEvent(event);
    }

    /**
     * @see org.springframework.context.ApplicationEventPublisher#publishEvent(java.lang.Object)
     */
    @Override
    public void publishEvent(Object o) {
        applicationContext.publishEvent(o);
    }

    /**
     * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
