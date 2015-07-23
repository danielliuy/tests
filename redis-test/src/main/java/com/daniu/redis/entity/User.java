/*
 * Copyright (c) 2012, 2013, Chuanhe Network Technology Company limited.
 * All rights reserved.
 */
package com.daniu.redis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户表.
 * @author Daniel Liu
 * @createTime 2014-12-25
 * @reviseDes 修订功能描述
 * @reviser
 * @reviseTime 2014-12-25
 * @version V1.0
 */
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 3068403988799178783L;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private short status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }
}
