/*
 * Copyright (c) 2012, 2013, Chuanhe Network Technology Company limited.
 * All rights reserved.
 */
package com.daniu.redis.dao.impl;

import org.springframework.stereotype.Repository;

import com.daniu.redis.dao.UserDao;
import com.daniu.redis.entity.User;

/**
 * 用户DAO实现.
 * @author Daniel Liu
 * @createTime 2015-1-7
 * @reviseDes 修订功能描述
 * @reviser
 * @reviseTime 2015-1-7
 * @version V1.0
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
}
