/*
 * Copyright (c) 2012, 2013, Chuanhe Network Technology Company limited.
 * All rights reserved.
 */
package com.daniu.redis.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.daniu.redis.BaseTest;
import com.daniu.redis.RedisClientUtils;
import com.daniu.redis.entity.User;

/**
 * .
 * @author Daniel Liu
 * @createTime 2015-1-7
 * @reviseDes 修订功能描述
 * @reviser
 * @reviseTime 2015-1-7
 * @version V1.0
 */
public class UserDaoTest extends BaseTest {

    @Resource
    private UserDao userDao;

    @Resource
    private RedisClientUtils redisClient;

    @Test
    public void setGetTest() {
        String key = "daniel";
        List<User> list = userDao.list(null, null, 0, 0);
        // set
        System.out.println("before:\n" + list);
        redisClient.set(key, list);
        // get
        List<User> users = redisClient.get(key);
        System.err.println("after:\n" + users);
    }

    @Test
    public void simpleTest() {
        String key = "ok?";
        System.err.println("Q:\t" + key);
        redisClient.set(key, "I'm fine!");
        String value = redisClient.get(key);
        System.err.println("A:\t" + value);
        key = "list";
        System.err.println("Q:\t" + key);
        List<String> list = new ArrayList<String>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");
        redisClient.set(key, list);
        List<String> list2 = redisClient.get(key);
        System.err.println("A:\t" + list2);
    }
}
