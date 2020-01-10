package com.limpid.springboot;

import com.limpid.springboot.model.UserInfo;
import com.limpid.springboot.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户信息服务缓存测试
 *
 * @auther cuiqiongyu
 * @create 2020/1/10 15:24
 */
@Slf4j
public class UserInfoServiceTest extends ApplicationTests {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 获取两次，查看日志验证缓存
     */
    // @Test
    public void getTwice() {
        // 模拟查询id为1的用户
        UserInfo user1 = userInfoService.get(1);
        log.debug("【user1】= {}", user1);

        // 再次查询
        UserInfo user2 = userInfoService.get(1);
        log.debug("【user2】= {}", user2);
        // 查看日志，只打印一次日志，证明缓存生效
    }

    /**
     * 先存，再查询，查看日志验证缓存
     */
    // @Test
    public void getAfterSave() {
        userInfoService.saveOrUpdate(new UserInfo(4, "测试中文"));

        UserInfo user = userInfoService.get(4);
        log.debug("【user】= {}", user);
        // 查看日志，只打印保存用户的日志，查询是未触发查询日志，因此缓存生效
    }

    /**
     * 测试删除，查看redis是否存在缓存数据
     */
    // @Test
    public void deleteUser() {
        // 查询一次，使redis中存在缓存数据
        userInfoService.get(1);
        // 删除，查看redis是否存在缓存数据
        userInfoService.delete(1);
    }

}
