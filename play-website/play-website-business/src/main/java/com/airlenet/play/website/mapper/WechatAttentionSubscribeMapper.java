package com.airlenet.play.website.mapper;

import com.airlenet.play.website.model.WechatAttentionSubscribe;
import com.airlenet.play.website.model.WechatAttentionSubscribeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WechatAttentionSubscribeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    long countByExample(WechatAttentionSubscribeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    int deleteByExample(WechatAttentionSubscribeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    int insert(WechatAttentionSubscribe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    int insertSelective(WechatAttentionSubscribe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    List<WechatAttentionSubscribe> selectByExample(WechatAttentionSubscribeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    WechatAttentionSubscribe selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") WechatAttentionSubscribe record, @Param("example") WechatAttentionSubscribeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    int updateByExample(@Param("record") WechatAttentionSubscribe record, @Param("example") WechatAttentionSubscribeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    int updateByPrimaryKeySelective(WechatAttentionSubscribe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_attention_subscribe
     *
     * @date
     */
    int updateByPrimaryKey(WechatAttentionSubscribe record);
}