package com.daniu.mybatis.model;

public class UserAlbumCollection {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_album_collection.album_id
     *
     * @mbggenerated
     */
    private Long albumId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_album_collection.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_album_collection.album_id
     *
     * @return the value of user_album_collection.album_id
     *
     * @mbggenerated
     */
    public Long getAlbumId() {
        return albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_album_collection.album_id
     *
     * @param albumId the value for user_album_collection.album_id
     *
     * @mbggenerated
     */
    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_album_collection.user_id
     *
     * @return the value of user_album_collection.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_album_collection.user_id
     *
     * @param userId the value for user_album_collection.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}