/*
 * Copyright (c) 2012, 2013, Chuanhe Network Technology Company limited.
 * All rights reserved.
 */
package com.daniu.freemarker.entity;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Entity基类.
 * @author Daniel Liu
 * @createTime 2014-12-23
 * @reviseDes 修订功能描述
 * @reviser
 * @reviseTime 2014-12-23
 * @version V1.0
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -8938349978718489141L;

    private static final ObjectMapper mapper = new ObjectMapper();

    /** 主键. */
    @Id
    @GeneratedValue
	protected Long id;

    /** 创建时间. */
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    /** 更新时间. */
    // @Column(name = "update_time")
    // @Temporal(TemporalType.TIMESTAMP)
    // private Date updateTime;

	public Long getId() {
        return id;
    }

	public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    // public Date getUpdateTime() {
    // return updateTime;
    // }
    //
    // public void setUpdateTime(Date updateTime) {
    // this.updateTime = updateTime;
    // }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
