package com.airshiplay.play.website.model;

import java.io.Serializable;

/**
 *
 * database table tbl_plugin_config_attribute
 *
 * @date do_not_delete_during_merge
 */
public class TblPluginConfigAttribute extends TblPluginConfigAttributeKey implements Serializable {
    private String attributes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_plugin_config_attribute
     *
     * @date
     */
    private static final long serialVersionUID = 1L;

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes == null ? null : attributes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_plugin_config_attribute
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
        TblPluginConfigAttribute other = (TblPluginConfigAttribute) that;
        return (this.getPluginConfigEntity_id() == null ? other.getPluginConfigEntity_id() == null : this.getPluginConfigEntity_id().equals(other.getPluginConfigEntity_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAttributes() == null ? other.getAttributes() == null : this.getAttributes().equals(other.getAttributes()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_plugin_config_attribute
     *
     * @date
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPluginConfigEntity_id() == null) ? 0 : getPluginConfigEntity_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_plugin_config_attribute
     *
     * @date
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attributes=").append(attributes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}