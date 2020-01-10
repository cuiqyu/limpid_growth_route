package com.limpid.springboot.service.impl;

import com.limpid.springboot.model.UserInfo;
import com.limpid.springboot.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 用户信息服务
 *
 * @auther cuiqiongyu
 * @create 2020/1/10 15:03
 */
@Service
@Slf4j
public class UserInfoServiceImpl implements UserInfoService {

    /**
     * 模拟用户信息数据库
     */
    private static ConcurrentHashMap<Integer, UserInfo> USERINFO_DATABASE = new ConcurrentHashMap<>(10);

    static {
        /**
         * 提供一些初始的用户信息数据
         */
        USERINFO_DATABASE.put(1, new UserInfo(1, "张三"));
        USERINFO_DATABASE.put(1, new UserInfo(2, "李四"));
        USERINFO_DATABASE.put(1, new UserInfo(3, "王五"));
    }

    /**
     * @see com.limpid.springboot.service.UserInfoService#saveOrUpdate(com.limpid.springboot.model.UserInfo)
     */
    @Override
    @CachePut(value = "userInfo", key = "#userInfo.id")
    public UserInfo saveOrUpdate(UserInfo userInfo) {
        USERINFO_DATABASE.put(userInfo.getId(), userInfo);
        log.info("保存用户【user】= {}", userInfo);
        return userInfo;
    }

    /**
     * @see com.limpid.springboot.service.UserInfoService#get(java.lang.Integer)
     */
    @Override
    @Cacheable(value = "userInfo", key = "#id")
    public UserInfo get(Integer id) {
        log.info("查询用户【id】= {}", id);
        return USERINFO_DATABASE.get(id);
    }

    /**
     * @see com.limpid.springboot.service.UserInfoService#delete(java.lang.Integer)
     */
    @Override
    @CacheEvict(value = "userInfo", key = "#id")
    public void delete(Integer id) {
        USERINFO_DATABASE.remove(id);
        log.info("删除用户【id】= {}", id);
    }

}
