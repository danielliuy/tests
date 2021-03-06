package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.FreeSubjectCategory;
import com.daniu.mybatis.model.FreeSubjectCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreeSubjectCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table free_subject_category
     *
     * @mbggenerated
     */
    int countByExample(FreeSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table free_subject_category
     *
     * @mbggenerated
     */
    int deleteByExample(FreeSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table free_subject_category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table free_subject_category
     *
     * @mbggenerated
     */
    int insert(FreeSubjectCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table free_subject_category
     *
     * @mbggenerated
     */
    int insertSelective(FreeSubjectCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table free_subject_category
     *
     * @mbggenerated
     */
    List<FreeSubjectCategory> selectByExample(FreeSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table free_subject_category
     *
     * @mbggenerated
     */
    FreeSubjectCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table free_subject_category
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") FreeSubjectCategory record, @Param("example") FreeSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table free_subject_category
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") FreeSubjectCategory record, @Param("example") FreeSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table free_subject_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FreeSubjectCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table free_subject_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FreeSubjectCategory record);
}