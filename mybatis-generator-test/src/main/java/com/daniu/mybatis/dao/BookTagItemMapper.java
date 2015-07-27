package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.BookTagItem;
import com.daniu.mybatis.model.BookTagItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookTagItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_tag_item
     *
     * @mbggenerated
     */
    int countByExample(BookTagItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_tag_item
     *
     * @mbggenerated
     */
    int deleteByExample(BookTagItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_tag_item
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("bid") Long bid, @Param("bookstore") Byte bookstore, @Param("tagId") Long tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_tag_item
     *
     * @mbggenerated
     */
    int insert(BookTagItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_tag_item
     *
     * @mbggenerated
     */
    int insertSelective(BookTagItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_tag_item
     *
     * @mbggenerated
     */
    List<BookTagItem> selectByExample(BookTagItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_tag_item
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BookTagItem record, @Param("example") BookTagItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_tag_item
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BookTagItem record, @Param("example") BookTagItemExample example);
}