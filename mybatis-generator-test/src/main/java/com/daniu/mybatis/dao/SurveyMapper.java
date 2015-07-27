package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.Survey;
import com.daniu.mybatis.model.SurveyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table survey
     *
     * @mbggenerated
     */
    int countByExample(SurveyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table survey
     *
     * @mbggenerated
     */
    int deleteByExample(SurveyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table survey
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table survey
     *
     * @mbggenerated
     */
    int insert(Survey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table survey
     *
     * @mbggenerated
     */
    int insertSelective(Survey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table survey
     *
     * @mbggenerated
     */
    List<Survey> selectByExample(SurveyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table survey
     *
     * @mbggenerated
     */
    Survey selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table survey
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Survey record, @Param("example") SurveyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table survey
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Survey record, @Param("example") SurveyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table survey
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Survey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table survey
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Survey record);
}