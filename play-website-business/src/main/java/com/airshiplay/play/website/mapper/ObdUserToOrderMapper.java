package com.airshiplay.play.website.mapper;

import com.airshiplay.play.website.model.ObdUserToOrderExample;
import com.airshiplay.play.website.model.ObdUserToOrderKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObdUserToOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_user_to_order
     *
     * @date
     */
    long countByExample(ObdUserToOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_user_to_order
     *
     * @date
     */
    int deleteByExample(ObdUserToOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_user_to_order
     *
     * @date
     */
    int deleteByPrimaryKey(ObdUserToOrderKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_user_to_order
     *
     * @date
     */
    int insert(ObdUserToOrderKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_user_to_order
     *
     * @date
     */
    int insertSelective(ObdUserToOrderKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_user_to_order
     *
     * @date
     */
    List<ObdUserToOrderKey> selectByExample(ObdUserToOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_user_to_order
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") ObdUserToOrderKey record, @Param("example") ObdUserToOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_user_to_order
     *
     * @date
     */
    int updateByExample(@Param("record") ObdUserToOrderKey record, @Param("example") ObdUserToOrderExample example);
}