package com.limpid.springboot;

import com.limpid.springboot.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * redis测试
 *
 * @auther cuiqiongyu
 * @create 2020/1/10 15:18
 */
@Slf4j
public class RedisTest extends ApplicationTests {

    @Autowired
    private RedisTemplate<String, Serializable> redisCacheTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 测试 Redis 操作
     */
    // @Test
    public void get() {
        // 测试线程安全，程序结束查看redis中count的值是否为1000
        ExecutorService executorService = Executors.newFixedThreadPool(1000);
        IntStream.range(0, 1000).forEach(i -> executorService.execute(() -> stringRedisTemplate.opsForValue().increment("count", 1)));

        stringRedisTemplate.opsForValue().set("k1", "v1");
        String k1 = stringRedisTemplate.opsForValue().get("k1");
        log.debug("【k1】= {}", k1);

        // 以下演示整合，具体Redis命令可以参考官方文档
        String key = "limpid:user:1";
        redisCacheTemplate.opsForValue().set(key, new UserInfo(1, "张三"));
        // 对应 String（字符串）
        UserInfo user = (UserInfo) redisCacheTemplate.opsForValue().get(key);
        log.debug("【userInfo】= {}", user);
    }


}
