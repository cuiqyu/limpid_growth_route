package com.limpid.springboot.config;

import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.stereotype.Component;

import java.util.concurrent.*;

/**
 * @auther cuiqiongyu
 * @create 2020/1/9 13:49
 */
@Component(value = "applicationEventMulticaster")
public class CustomerApplicationEventMulticaster extends SimpleApplicationEventMulticaster {

    public CustomerApplicationEventMulticaster() {
        super.setTaskExecutor(getExecutor());
    }

    private Executor getExecutor() {
        return new ThreadPoolExecutor(5, 10, 60L, TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(1000000), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                //设置线程名称,以便排查
                thread.setName("--eventMulticaster thread---");
                return thread;
            }
        });
    }

}
