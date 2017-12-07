package com.airlenet.play.website.model;

import java.io.Serializable;
import java.util.Date;

/**
 * database table wechat_imgtext_template
 *
 * @date do_not_delete_during_merge
 */
public class WechatImgtextTemplate implements Serializable {
    private Long id;

    private Date createdDate;

    private Date lastModifiedDate;

    private String content;

    private String title;

    private Long createdBy_id;

    private Long lastModifiedBy_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wechat_imgtext_template
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_imgtext_template
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
        WechatImgtextTemplate other = (WechatImgtextTemplate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
                && (this.getLastModifiedDate() == null ? other.getLastModifiedDate() == null : this.getLastModifiedDate().equals(other.getLastModifiedDate()))
                && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
                && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
                && (this.getCreatedBy_id() == null ? other.getCreatedBy_id() == null : this.getCreatedBy_id().equals(other.getCreatedBy_id()))
                && (this.getLastModifiedBy_id() == null ? other.getLastModifiedBy_id() == null : this.getLastModifiedBy_id().equals(other.getLastModifiedBy_id()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_imgtext_template
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
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCreatedBy_id() == null) ? 0 : getCreatedBy_id().hashCode());
        result = prime * result + ((getLastModifiedBy_id() == null) ? 0 : getLastModifiedBy_id().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_imgtext_template
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
        sb.append(", content=").append(content);
        sb.append(", title=").append(title);
        sb.append(", createdBy_id=").append(createdBy_id);
        sb.append(", lastModifiedBy_id=").append(lastModifiedBy_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}