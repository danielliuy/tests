package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.ShelfRecommendItem;
import com.daniu.mybatis.model.ShelfRecommendItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShelfRecommendItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shelf_recommend_item
     *
     * @mbggenerated
     */
    int countByExample(ShelfRecommendItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shelf_recommend_item
     *
     * @mbggenerated
     */
    int deleteByExample(ShelfRecommendItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shelf_recommend_item
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shelf_recommend_item
     *
     * @mbggenerated
     */
    int insert(ShelfRecommendItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shelf_recommend_item
     *
     * @mbggenerated
     */
    int insertSelective(ShelfRecommendItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shelf_recommend_item
     *
     * @mbggenerated
     */
    List<ShelfRecommendItem> selectByExample(ShelfRecommendItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shelf_recommend_item
     *
     * @mbggenerated
     */
    ShelfRecommendItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shelf_recommend_item
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ShelfRecommendItem record, @Param("example") ShelfRecommendItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shelf_recommend_item
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ShelfRecommendItem record, @Param("example") ShelfRecommendItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shelf_recommend_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ShelfRecommendItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shelf_recommend_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ShelfRecommendItem record);
}