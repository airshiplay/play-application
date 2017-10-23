package com.airshiplay.play.website.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * database table shop_product_category
 *
 * @date do_not_delete_during_merge
 */
public class ShopProductCategory implements Serializable {
    private Long id;

    private Date createdDate;

    private Date lastModifiedDate;

    private Integer sortNo;

    private String treePath;

    private String name;

    private String seoDescription;

    private String seoKeywords;

    private String seoTitle;

    private Long createdBy_id;

    private Long lastModifiedBy_id;

    private Long parent_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shop_product_category
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

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getTreePath() {
        return treePath;
    }

    public void setTreePath(String treePath) {
        this.treePath = treePath == null ? null : treePath.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
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
        ShopProductCategory other = (ShopProductCategory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
            && (this.getLastModifiedDate() == null ? other.getLastModifiedDate() == null : this.getLastModifiedDate().equals(other.getLastModifiedDate()))
            && (this.getSortNo() == null ? other.getSortNo() == null : this.getSortNo().equals(other.getSortNo()))
            && (this.getTreePath() == null ? other.getTreePath() == null : this.getTreePath().equals(other.getTreePath()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSeoDescription() == null ? other.getSeoDescription() == null : this.getSeoDescription().equals(other.getSeoDescription()))
            && (this.getSeoKeywords() == null ? other.getSeoKeywords() == null : this.getSeoKeywords().equals(other.getSeoKeywords()))
            && (this.getSeoTitle() == null ? other.getSeoTitle() == null : this.getSeoTitle().equals(other.getSeoTitle()))
            && (this.getCreatedBy_id() == null ? other.getCreatedBy_id() == null : this.getCreatedBy_id().equals(other.getCreatedBy_id()))
            && (this.getLastModifiedBy_id() == null ? other.getLastModifiedBy_id() == null : this.getLastModifiedBy_id().equals(other.getLastModifiedBy_id()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
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
        result = prime * result + ((getSortNo() == null) ? 0 : getSortNo().hashCode());
        result = prime * result + ((getTreePath() == null) ? 0 : getTreePath().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSeoDescription() == null) ? 0 : getSeoDescription().hashCode());
        result = prime * result + ((getSeoKeywords() == null) ? 0 : getSeoKeywords().hashCode());
        result = prime * result + ((getSeoTitle() == null) ? 0 : getSeoTitle().hashCode());
        result = prime * result + ((getCreatedBy_id() == null) ? 0 : getCreatedBy_id().hashCode());
        result = prime * result + ((getLastModifiedBy_id() == null) ? 0 : getLastModifiedBy_id().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_product_category
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
        sb.append(", sortNo=").append(sortNo);
        sb.append(", treePath=").append(treePath);
        sb.append(", name=").append(name);
        sb.append(", seoDescription=").append(seoDescription);
        sb.append(", seoKeywords=").append(seoKeywords);
        sb.append(", seoTitle=").append(seoTitle);
        sb.append(", createdBy_id=").append(createdBy_id);
        sb.append(", lastModifiedBy_id=").append(lastModifiedBy_id);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}