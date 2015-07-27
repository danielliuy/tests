package com.daniu.mybatis.model;

public class BookAlbum {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_album.album_id
     *
     * @mbggenerated
     */
    private Long albumId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_album.book_id
     *
     * @mbggenerated
     */
    private Long bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_album.comment_id
     *
     * @mbggenerated
     */
    private Long commentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_album.order
     *
     * @mbggenerated
     */
    private Integer order;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_album.source
     *
     * @mbggenerated
     */
    private Integer source;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_album.album_id
     *
     * @return the value of book_album.album_id
     *
     * @mbggenerated
     */
    public Long getAlbumId() {
        return albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_album.album_id
     *
     * @param albumId the value for book_album.album_id
     *
     * @mbggenerated
     */
    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_album.book_id
     *
     * @return the value of book_album.book_id
     *
     * @mbggenerated
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_album.book_id
     *
     * @param bookId the value for book_album.book_id
     *
     * @mbggenerated
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_album.comment_id
     *
     * @return the value of book_album.comment_id
     *
     * @mbggenerated
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_album.comment_id
     *
     * @param commentId the value for book_album.comment_id
     *
     * @mbggenerated
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_album.order
     *
     * @return the value of book_album.order
     *
     * @mbggenerated
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_album.order
     *
     * @param order the value for book_album.order
     *
     * @mbggenerated
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_album.source
     *
     * @return the value of book_album.source
     *
     * @mbggenerated
     */
    public Integer getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_album.source
     *
     * @param source the value for book_album.source
     *
     * @mbggenerated
     */
    public void setSource(Integer source) {
        this.source = source;
    }
}