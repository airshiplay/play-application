package com.airshiplay.play.website.mapper;

import com.airshiplay.play.website.model.ShopProductCategory;
import com.airshiplay.play.website.model.ShopProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopProductCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
     *
     * @date
     */
    long countByExample(ShopProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
     *
     * @date
     */
    int deleteByExample(ShopProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
     *
     * @date
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
     *
     * @date
     */
    int insert(ShopProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
     *
     * @date
     */
    int insertSelective(ShopProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
     *
     * @date
     */
    List<ShopProductCategory> selectByExample(ShopProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
     *
     * @date
     */
    ShopProductCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") ShopProductCategory record, @Param("example") ShopProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
     *
     * @date
     */
    int updateByExample(@Param("record") ShopProductCategory record, @Param("example") ShopProductCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
     *
     * @date
     */
    int updateByPrimaryKeySelective(ShopProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
     *
     * @date
     */
    int updateByPrimaryKey(ShopProductCategory record);
}