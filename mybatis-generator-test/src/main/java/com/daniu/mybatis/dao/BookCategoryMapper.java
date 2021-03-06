package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.BookCategory;
import com.daniu.mybatis.model.BookCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_category
     *
     * @mbggenerated
     */
    int countByExample(BookCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_category
     *
     * @mbggenerated
     */
    int deleteByExample(BookCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_category
     *
     * @mbggenerated
     */
    int insert(BookCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_category
     *
     * @mbggenerated
     */
    int insertSelective(BookCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_category
     *
     * @mbggenerated
     */
    List<BookCategory> selectByExample(BookCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_category
     *
     * @mbggenerated
     */
    BookCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_category
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BookCategory record, @Param("example") BookCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_category
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BookCategory record, @Param("example") BookCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BookCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BookCategory record);
}