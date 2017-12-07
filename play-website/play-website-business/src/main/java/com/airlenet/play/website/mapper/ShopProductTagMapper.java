package com.airlenet.play.website.mapper;

import com.airlenet.play.website.model.ShopProductTag;
import com.airlenet.play.website.model.ShopProductTagExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ShopProductTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_tag
     *
     * @date
     */
    long countByExample(ShopProductTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_tag
     *
     * @date
     */
    int deleteByExample(ShopProductTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_tag
     *
     * @date
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_tag
     *
     * @date
     */
    int insert(ShopProductTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_tag
     *
     * @date
     */
    int insertSelective(ShopProductTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_tag
     *
     * @date
     */
    List<ShopProductTag> selectByExample(ShopProductTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_tag
     *
     * @date
     */
    ShopProductTag selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_tag
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") ShopProductTag record, @Param("example") ShopProductTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_tag
     *
     * @date
     */
    int updateByExample(@Param("record") ShopProductTag record, @Param("example") ShopProductTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_tag
     *
     * @date
     */
    int updateByPrimaryKeySelective(ShopProductTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_tag
     *
     * @date
     */
    int updateByPrimaryKey(ShopProductTag record);
}