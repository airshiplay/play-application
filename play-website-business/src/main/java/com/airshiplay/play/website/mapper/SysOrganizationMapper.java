package com.airshiplay.play.website.mapper;

import com.airshiplay.play.website.model.SysOrganization;
import com.airshiplay.play.website.model.SysOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @date
     */
    long countByExample(SysOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @date
     */
    int deleteByExample(SysOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @date
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @date
     */
    int insert(SysOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @date
     */
    int insertSelective(SysOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @date
     */
    List<SysOrganization> selectByExample(SysOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @date
     */
    SysOrganization selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") SysOrganization record, @Param("example") SysOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @date
     */
    int updateByExample(@Param("record") SysOrganization record, @Param("example") SysOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @date
     */
    int updateByPrimaryKeySelective(SysOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_organization
     *
     * @date
     */
    int updateByPrimaryKey(SysOrganization record);
}