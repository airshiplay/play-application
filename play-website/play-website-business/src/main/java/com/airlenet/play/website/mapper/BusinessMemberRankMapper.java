package com.airlenet.play.website.mapper;

import com.airlenet.play.website.model.BusinessMemberRank;
import com.airlenet.play.website.model.BusinessMemberRankExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BusinessMemberRankMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member_rank
     *
     * @date
     */
    long countByExample(BusinessMemberRankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member_rank
     *
     * @date
     */
    int deleteByExample(BusinessMemberRankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member_rank
     *
     * @date
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member_rank
     *
     * @date
     */
    int insert(BusinessMemberRank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member_rank
     *
     * @date
     */
    int insertSelective(BusinessMemberRank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member_rank
     *
     * @date
     */
    List<BusinessMemberRank> selectByExample(BusinessMemberRankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member_rank
     *
     * @date
     */
    BusinessMemberRank selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member_rank
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") BusinessMemberRank record, @Param("example") BusinessMemberRankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member_rank
     *
     * @date
     */
    int updateByExample(@Param("record") BusinessMemberRank record, @Param("example") BusinessMemberRankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member_rank
     *
     * @date
     */
    int updateByPrimaryKeySelective(BusinessMemberRank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member_rank
     *
     * @date
     */
    int updateByPrimaryKey(BusinessMemberRank record);
}