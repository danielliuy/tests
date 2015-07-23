/*
 * Copyright (c) 2012, 2013, Chuanhe Network Technology Company limited.
 * All rights reserved.
 */
package com.daniu.redis;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Redis.
 * @author Daniel Liu
 * @createTime 2015-1-7
 * @reviseDes 修订功能描述
 * @reviser
 * @reviseTime 2015-1-7
 * @version V1.0
 */
@Service("redisClient")
public class RedisClientUtils {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public void set(final String key, final Object value) {
        redisTemplate.boundValueOps(key).set(value);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(final String key) {
        return (T) redisTemplate.boundValueOps(key).get();
    }

    public boolean delete(final String key) {
        try {
            redisTemplate.delete(key);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(final Set<String> keys) {
        try {
            redisTemplate.delete(keys);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
