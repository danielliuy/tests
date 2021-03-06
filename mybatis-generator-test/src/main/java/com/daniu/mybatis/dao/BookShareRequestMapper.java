package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.BookShareRequest;
import com.daniu.mybatis.model.BookShareRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookShareRequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_share_request
     *
     * @mbggenerated
     */
    int countByExample(BookShareRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_share_request
     *
     * @mbggenerated
     */
    int deleteByExample(BookShareRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_share_request
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("shareId") Long shareId, @Param("userId") Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_share_request
     *
     * @mbggenerated
     */
    int insert(BookShareRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_share_request
     *
     * @mbggenerated
     */
    int insertSelective(BookShareRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_share_request
     *
     * @mbggenerated
     */
    List<BookShareRequest> selectByExample(BookShareRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_share_request
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BookShareRequest record, @Param("example") BookShareRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_share_request
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BookShareRequest record, @Param("example") BookShareRequestExample example);
}