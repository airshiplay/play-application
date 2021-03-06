package com.airlenet.play.website.mapper;

import com.airlenet.play.website.model.ObdOrder;
import com.airlenet.play.website.model.ObdOrderExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ObdOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_order
     *
     * @date
     */
    long countByExample(ObdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_order
     *
     * @date
     */
    int deleteByExample(ObdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_order
     *
     * @date
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_order
     *
     * @date
     */
    int insert(ObdOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_order
     *
     * @date
     */
    int insertSelective(ObdOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_order
     *
     * @date
     */
    List<ObdOrder> selectByExample(ObdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_order
     *
     * @date
     */
    ObdOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_order
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") ObdOrder record, @Param("example") ObdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_order
     *
     * @date
     */
    int updateByExample(@Param("record") ObdOrder record, @Param("example") ObdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_order
     *
     * @date
     */
    int updateByPrimaryKeySelective(ObdOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_order
     *
     * @date
     */
    int updateByPrimaryKey(ObdOrder record);
}