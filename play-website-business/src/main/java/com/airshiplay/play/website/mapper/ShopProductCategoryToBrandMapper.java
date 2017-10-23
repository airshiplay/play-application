package com.airshiplay.play.website.mapper;

import com.airshiplay.play.website.model.ShopProductCategoryToBrandExample;
import com.airshiplay.play.website.model.ShopProductCategoryToBrandKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopProductCategoryToBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category_to_brand
     *
     * @date
     */
    long countByExample(ShopProductCategoryToBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category_to_brand
     *
     * @date
     */
    int deleteByExample(ShopProductCategoryToBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category_to_brand
     *
     * @date
     */
    int deleteByPrimaryKey(ShopProductCategoryToBrandKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category_to_brand
     *
     * @date
     */
    int insert(ShopProductCategoryToBrandKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category_to_brand
     *
     * @date
     */
    int insertSelective(ShopProductCategoryToBrandKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category_to_brand
     *
     * @date
     */
    List<ShopProductCategoryToBrandKey> selectByExample(ShopProductCategoryToBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category_to_brand
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") ShopProductCategoryToBrandKey record, @Param("example") ShopProductCategoryToBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category_to_brand
     *
     * @date
     */
    int updateByExample(@Param("record") ShopProductCategoryToBrandKey record, @Param("example") ShopProductCategoryToBrandExample example);
}