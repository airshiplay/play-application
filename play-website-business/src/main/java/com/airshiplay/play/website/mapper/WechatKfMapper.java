package com.airshiplay.play.website.mapper;

import com.airshiplay.play.website.model.WechatKf;
import com.airshiplay.play.website.model.WechatKfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatKfMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_kf
     *
     * @date
     */
    long countByExample(WechatKfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_kf
     *
     * @date
     */
    int deleteByExample(WechatKfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_kf
     *
     * @date
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_kf
     *
     * @date
     */
    int insert(WechatKf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_kf
     *
     * @date
     */
    int insertSelective(WechatKf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_kf
     *
     * @date
     */
    List<WechatKf> selectByExample(WechatKfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_kf
     *
     * @date
     */
    WechatKf selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_kf
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") WechatKf record, @Param("example") WechatKfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_kf
     *
     * @date
     */
    int updateByExample(@Param("record") WechatKf record, @Param("example") WechatKfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_kf
     *
     * @date
     */
    int updateByPrimaryKeySelective(WechatKf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_kf
     *
     * @date
     */
    int updateByPrimaryKey(WechatKf record);
}