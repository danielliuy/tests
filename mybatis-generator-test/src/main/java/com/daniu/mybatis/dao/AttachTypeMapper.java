package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.AttachType;
import com.daniu.mybatis.model.AttachTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttachTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attach_type
     *
     * @mbggenerated
     */
    int countByExample(AttachTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attach_type
     *
     * @mbggenerated
     */
    int deleteByExample(AttachTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attach_type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attach_type
     *
     * @mbggenerated
     */
    int insert(AttachType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attach_type
     *
     * @mbggenerated
     */
    int insertSelective(AttachType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attach_type
     *
     * @mbggenerated
     */
    List<AttachType> selectByExample(AttachTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attach_type
     *
     * @mbggenerated
     */
    AttachType selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attach_type
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AttachType record, @Param("example") AttachTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attach_type
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AttachType record, @Param("example") AttachTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attach_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AttachType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attach_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AttachType record);
}