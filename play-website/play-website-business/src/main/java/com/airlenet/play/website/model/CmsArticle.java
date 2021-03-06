package com.airlenet.play.website.model;

import java.io.Serializable;
import java.util.Date;

/**
 * database table cms_article
 *
 * @date do_not_delete_during_merge
 */
public class CmsArticle implements Serializable {
    private Long id;

    private Date createdDate;

    private Date lastModifiedDate;

    private String author;

    private String coverImage;

    private Long hits;

    private Boolean publication;

    private String seoDescription;

    private String seoKeywords;

    private String seoTitle;

    private Boolean stick;

    private String summary;

    private String title;

    private Long createdBy_id;

    private Long lastModifiedBy_id;

    private Long articleCategory_id;

    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_article
     *
     * @date
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage == null ? null : coverImage.trim();
    }

    public Long getHits() {
        return hits;
    }

    public void setHits(Long hits) {
        this.hits = hits;
    }

    public Boolean getPublication() {
        return publication;
    }

    public void setPublication(Boolean publication) {
        this.publication = publication;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription == null ? null : seoDescription.trim();
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords == null ? null : seoKeywords.trim();
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle == null ? null : seoTitle.trim();
    }

    public Boolean getStick() {
        return stick;
    }

    public void setStick(Boolean stick) {
        this.stick = stick;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getCreatedBy_id() {
        return createdBy_id;
    }

    public void setCreatedBy_id(Long createdBy_id) {
        this.createdBy_id = createdBy_id;
    }

    public Long getLastModifiedBy_id() {
        return lastModifiedBy_id;
    }

    public void setLastModifiedBy_id(Long lastModifiedBy_id) {
        this.lastModifiedBy_id = lastModifiedBy_id;
    }

    public Long getArticleCategory_id() {
        return articleCategory_id;
    }

    public void setArticleCategory_id(Long articleCategory_id) {
        this.articleCategory_id = articleCategory_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CmsArticle other = (CmsArticle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
                && (this.getLastModifiedDate() == null ? other.getLastModifiedDate() == null : this.getLastModifiedDate().equals(other.getLastModifiedDate()))
                && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
                && (this.getCoverImage() == null ? other.getCoverImage() == null : this.getCoverImage().equals(other.getCoverImage()))
                && (this.getHits() == null ? other.getHits() == null : this.getHits().equals(other.getHits()))
                && (this.getPublication() == null ? other.getPublication() == null : this.getPublication().equals(other.getPublication()))
                && (this.getSeoDescription() == null ? other.getSeoDescription() == null : this.getSeoDescription().equals(other.getSeoDescription()))
                && (this.getSeoKeywords() == null ? other.getSeoKeywords() == null : this.getSeoKeywords().equals(other.getSeoKeywords()))
                && (this.getSeoTitle() == null ? other.getSeoTitle() == null : this.getSeoTitle().equals(other.getSeoTitle()))
                && (this.getStick() == null ? other.getStick() == null : this.getStick().equals(other.getStick()))
                && (this.getSummary() == null ? other.getSummary() == null : this.getSummary().equals(other.getSummary()))
                && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
                && (this.getCreatedBy_id() == null ? other.getCreatedBy_id() == null : this.getCreatedBy_id().equals(other.getCreatedBy_id()))
                && (this.getLastModifiedBy_id() == null ? other.getLastModifiedBy_id() == null : this.getLastModifiedBy_id().equals(other.getLastModifiedBy_id()))
                && (this.getArticleCategory_id() == null ? other.getArticleCategory_id() == null : this.getArticleCategory_id().equals(other.getArticleCategory_id()))
                && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        result = prime * result + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getCoverImage() == null) ? 0 : getCoverImage().hashCode());
        result = prime * result + ((getHits() == null) ? 0 : getHits().hashCode());
        result = prime * result + ((getPublication() == null) ? 0 : getPublication().hashCode());
        result = prime * result + ((getSeoDescription() == null) ? 0 : getSeoDescription().hashCode());
        result = prime * result + ((getSeoKeywords() == null) ? 0 : getSeoKeywords().hashCode());
        result = prime * result + ((getSeoTitle() == null) ? 0 : getSeoTitle().hashCode());
        result = prime * result + ((getStick() == null) ? 0 : getStick().hashCode());
        result = prime * result + ((getSummary() == null) ? 0 : getSummary().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCreatedBy_id() == null) ? 0 : getCreatedBy_id().hashCode());
        result = prime * result + ((getLastModifiedBy_id() == null) ? 0 : getLastModifiedBy_id().hashCode());
        result = prime * result + ((getArticleCategory_id() == null) ? 0 : getArticleCategory_id().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @date
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", lastModifiedDate=").append(lastModifiedDate);
        sb.append(", author=").append(author);
        sb.append(", coverImage=").append(coverImage);
        sb.append(", hits=").append(hits);
        sb.append(", publication=").append(publication);
        sb.append(", seoDescription=").append(seoDescription);
        sb.append(", seoKeywords=").append(seoKeywords);
        sb.append(", seoTitle=").append(seoTitle);
        sb.append(", stick=").append(stick);
        sb.append(", summary=").append(summary);
        sb.append(", title=").append(title);
        sb.append(", createdBy_id=").append(createdBy_id);
        sb.append(", lastModifiedBy_id=").append(lastModifiedBy_id);
        sb.append(", articleCategory_id=").append(articleCategory_id);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}