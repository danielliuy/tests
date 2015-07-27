package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.QuestCategory;
import com.daniu.mybatis.model.QuestCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_category
     *
     * @mbggenerated
     */
    int countByExample(QuestCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_category
     *
     * @mbggenerated
     */
    int deleteByExample(QuestCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_category
     *
     * @mbggenerated
     */
    int insert(QuestCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_category
     *
     * @mbggenerated
     */
    int insertSelective(QuestCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_category
     *
     * @mbggenerated
     */
    List<QuestCategory> selectByExample(QuestCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_category
     *
     * @mbggenerated
     */
    QuestCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_category
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") QuestCategory record, @Param("example") QuestCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_category
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") QuestCategory record, @Param("example") QuestCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(QuestCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(QuestCategory record);
}