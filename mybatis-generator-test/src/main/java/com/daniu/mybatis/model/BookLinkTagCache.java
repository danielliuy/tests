package com.daniu.mybatis.model;

public class BookLinkTagCache {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_link_tag_cache.book_id
     *
     * @mbggenerated
     */
    private Long bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_link_tag_cache.tag_ids
     *
     * @mbggenerated
     */
    private String tagIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_link_tag_cache.tag_names
     *
     * @mbggenerated
     */
    private String tagNames;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_link_tag_cache.book_id
     *
     * @return the value of book_link_tag_cache.book_id
     *
     * @mbggenerated
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_link_tag_cache.book_id
     *
     * @param bookId the value for book_link_tag_cache.book_id
     *
     * @mbggenerated
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_link_tag_cache.tag_ids
     *
     * @return the value of book_link_tag_cache.tag_ids
     *
     * @mbggenerated
     */
    public String getTagIds() {
        return tagIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_link_tag_cache.tag_ids
     *
     * @param tagIds the value for book_link_tag_cache.tag_ids
     *
     * @mbggenerated
     */
    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_link_tag_cache.tag_names
     *
     * @return the value of book_link_tag_cache.tag_names
     *
     * @mbggenerated
     */
    public String getTagNames() {
        return tagNames;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_link_tag_cache.tag_names
     *
     * @param tagNames the value for book_link_tag_cache.tag_names
     *
     * @mbggenerated
     */
    public void setTagNames(String tagNames) {
        this.tagNames = tagNames;
    }
}