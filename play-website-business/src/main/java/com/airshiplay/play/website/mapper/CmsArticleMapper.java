package com.airshiplay.play.website.mapper;

import com.airshiplay.play.website.model.CmsArticle;
import com.airshiplay.play.website.model.CmsArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    long countByExample(CmsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    int deleteByExample(CmsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    int insert(CmsArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    int insertSelective(CmsArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    List<CmsArticle> selectByExampleWithBLOBs(CmsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    List<CmsArticle> selectByExample(CmsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    CmsArticle selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") CmsArticle record, @Param("example") CmsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    int updateByExampleWithBLOBs(@Param("record") CmsArticle record, @Param("example") CmsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    int updateByExample(@Param("record") CmsArticle record, @Param("example") CmsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    int updateByPrimaryKeySelective(CmsArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    int updateByPrimaryKeyWithBLOBs(CmsArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    int updateByPrimaryKey(CmsArticle record);
}