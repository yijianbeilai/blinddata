package com.sz.blinddata;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
public class redsit {
    @Resource
    private RedisTemplate redisTemplate;
    @Test
    public void setRedisKey(){
        redisTemplate.opsForValue().set("qwer","qwer");
    }
}
