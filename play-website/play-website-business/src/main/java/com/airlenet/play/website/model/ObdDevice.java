package com.airlenet.play.website.model;

import java.io.Serializable;
import java.util.Date;

/**
 * database table obd_device
 *
 * @date do_not_delete_during_merge
 */
public class ObdDevice implements Serializable {
    private Long id;

    private Date createdDate;

    private Date lastModifiedDate;

    private String description;

    private String deviveNo;

    private String type;

    private Long createdBy_id;

    private Long lastModifiedBy_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table obd_device
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDeviveNo() {
        return deviveNo;
    }

    public void setDeviveNo(String deviveNo) {
        this.deviveNo = deviveNo == null ? null : deviveNo.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
     * This method corresponds to the database table obd_device
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
        ObdDevice other = (ObdDevice) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
                && (this.getLastModifiedDate() == null ? other.getLastModifiedDate() == null : this.getLastModifiedDate().equals(other.getLastModifiedDate()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
                && (this.getDeviveNo() == null ? other.getDeviveNo() == null : this.getDeviveNo().equals(other.getDeviveNo()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getCreatedBy_id() == null ? other.getCreatedBy_id() == null : this.getCreatedBy_id().equals(other.getCreatedBy_id()))
                && (this.getLastModifiedBy_id() == null ? other.getLastModifiedBy_id() == null : this.getLastModifiedBy_id().equals(other.getLastModifiedBy_id()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_device
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
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getDeviveNo() == null) ? 0 : getDeviveNo().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreatedBy_id() == null) ? 0 : getCreatedBy_id().hashCode());
        result = prime * result + ((getLastModifiedBy_id() == null) ? 0 : getLastModifiedBy_id().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obd_device
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
        sb.append(", description=").append(description);
        sb.append(", deviveNo=").append(deviveNo);
        sb.append(", type=").append(type);
        sb.append(", createdBy_id=").append(createdBy_id);
        sb.append(", lastModifiedBy_id=").append(lastModifiedBy_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}