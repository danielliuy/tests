package com.daniu.mybatis.model;

import java.util.Date;

public class BookShareComment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_share_comment.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_share_comment.share_id
     *
     * @mbggenerated
     */
    private Long shareId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_share_comment.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_share_comment.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_share_comment.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_share_comment.id
     *
     * @return the value of book_share_comment.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_share_comment.id
     *
     * @param id the value for book_share_comment.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_share_comment.share_id
     *
     * @return the value of book_share_comment.share_id
     *
     * @mbggenerated
     */
    public Long getShareId() {
        return shareId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_share_comment.share_id
     *
     * @param shareId the value for book_share_comment.share_id
     *
     * @mbggenerated
     */
    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_share_comment.user_id
     *
     * @return the value of book_share_comment.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_share_comment.user_id
     *
     * @param userId the value for book_share_comment.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_share_comment.content
     *
     * @return the value of book_share_comment.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_share_comment.content
     *
     * @param content the value for book_share_comment.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_share_comment.create_time
     *
     * @return the value of book_share_comment.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_share_comment.create_time
     *
     * @param createTime the value for book_share_comment.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}