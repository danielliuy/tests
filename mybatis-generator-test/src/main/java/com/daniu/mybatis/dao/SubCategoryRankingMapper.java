package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.SubCategoryRanking;
import com.daniu.mybatis.model.SubCategoryRankingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubCategoryRankingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_category_ranking
     *
     * @mbggenerated
     */
    int countByExample(SubCategoryRankingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_category_ranking
     *
     * @mbggenerated
     */
    int deleteByExample(SubCategoryRankingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_category_ranking
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("bookId") Long bookId, @Param("categoryId") Integer categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_category_ranking
     *
     * @mbggenerated
     */
    int insert(SubCategoryRanking record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_category_ranking
     *
     * @mbggenerated
     */
    int insertSelective(SubCategoryRanking record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_category_ranking
     *
     * @mbggenerated
     */
    List<SubCategoryRanking> selectByExample(SubCategoryRankingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_category_ranking
     *
     * @mbggenerated
     */
    SubCategoryRanking selectByPrimaryKey(@Param("bookId") Long bookId, @Param("categoryId") Integer categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_category_ranking
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SubCategoryRanking record, @Param("example") SubCategoryRankingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_category_ranking
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SubCategoryRanking record, @Param("example") SubCategoryRankingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_category_ranking
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SubCategoryRanking record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_category_ranking
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SubCategoryRanking record);
}