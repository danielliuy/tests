package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.BookAlbum;
import com.daniu.mybatis.model.BookAlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookAlbumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_album
     *
     * @mbggenerated
     */
    int countByExample(BookAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_album
     *
     * @mbggenerated
     */
    int deleteByExample(BookAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_album
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("albumId") Long albumId, @Param("bookId") Long bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_album
     *
     * @mbggenerated
     */
    int insert(BookAlbum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_album
     *
     * @mbggenerated
     */
    int insertSelective(BookAlbum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_album
     *
     * @mbggenerated
     */
    List<BookAlbum> selectByExample(BookAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_album
     *
     * @mbggenerated
     */
    BookAlbum selectByPrimaryKey(@Param("albumId") Long albumId, @Param("bookId") Long bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_album
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BookAlbum record, @Param("example") BookAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_album
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BookAlbum record, @Param("example") BookAlbumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_album
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BookAlbum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_album
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BookAlbum record);
}