package com.daniu.mybatis.model;

import java.util.Date;

public class BookLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_log.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_log.clickDownload
     *
     * @mbggenerated
     */
    private Integer clickdownload;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_log.last_updatetime
     *
     * @mbggenerated
     */
    private Date lastUpdatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_log.bookId
     *
     * @mbggenerated
     */
    private String bookid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_log.id
     *
     * @return the value of book_log.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_log.id
     *
     * @param id the value for book_log.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_log.clickDownload
     *
     * @return the value of book_log.clickDownload
     *
     * @mbggenerated
     */
    public Integer getClickdownload() {
        return clickdownload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_log.clickDownload
     *
     * @param clickdownload the value for book_log.clickDownload
     *
     * @mbggenerated
     */
    public void setClickdownload(Integer clickdownload) {
        this.clickdownload = clickdownload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_log.last_updatetime
     *
     * @return the value of book_log.last_updatetime
     *
     * @mbggenerated
     */
    public Date getLastUpdatetime() {
        return lastUpdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_log.last_updatetime
     *
     * @param lastUpdatetime the value for book_log.last_updatetime
     *
     * @mbggenerated
     */
    public void setLastUpdatetime(Date lastUpdatetime) {
        this.lastUpdatetime = lastUpdatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_log.bookId
     *
     * @return the value of book_log.bookId
     *
     * @mbggenerated
     */
    public String getBookid() {
        return bookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_log.bookId
     *
     * @param bookid the value for book_log.bookId
     *
     * @mbggenerated
     */
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }
}