package com.limpid.springboot.service;

import com.limpid.springboot.model.UserInfo;

/**
 * 用户信息服务
 *
 * @auther cuiqiongyu
 * @create 2020/1/10 15:03
 */
public interface UserInfoService {

    /**
     * 新增或更新用户信息
     *
     * @param user 用户信息
     * @return
     */
    UserInfo saveOrUpdate(UserInfo user);

    /**
     * 根据用户id获取用户信息
     *
     * @param id 用户id
     * @return
     */
    UserInfo get(Integer id);

    /**
     * 根据用户id删除用户信息
     *
     * @param id 用户id
     */
    void delete(Integer id);

}
