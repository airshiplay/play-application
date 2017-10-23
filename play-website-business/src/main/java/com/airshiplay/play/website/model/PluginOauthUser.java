package com.airshiplay.play.website.model;

import java.io.Serializable;

/**
 *
 * database table plugin_oauth_user
 *
 * @date do_not_delete_during_merge
 */
public class PluginOauthUser implements Serializable {
    private Long id;

    private String avatarUrl;

    private String name;

    private String oauthPluginId;

    private String userId;

    private String username;

    private Long owner_admin_user_id;

    private Long owner_member_user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plugin_oauth_user
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

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOauthPluginId() {
        return oauthPluginId;
    }

    public void setOauthPluginId(String oauthPluginId) {
        this.oauthPluginId = oauthPluginId == null ? null : oauthPluginId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getOwner_admin_user_id() {
        return owner_admin_user_id;
    }

    public void setOwner_admin_user_id(Long owner_admin_user_id) {
        this.owner_admin_user_id = owner_admin_user_id;
    }

    public Long getOwner_member_user_id() {
        return owner_member_user_id;
    }

    public void setOwner_member_user_id(Long owner_member_user_id) {
        this.owner_member_user_id = owner_member_user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin_oauth_user
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
        PluginOauthUser other = (PluginOauthUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAvatarUrl() == null ? other.getAvatarUrl() == null : this.getAvatarUrl().equals(other.getAvatarUrl()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOauthPluginId() == null ? other.getOauthPluginId() == null : this.getOauthPluginId().equals(other.getOauthPluginId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getOwner_admin_user_id() == null ? other.getOwner_admin_user_id() == null : this.getOwner_admin_user_id().equals(other.getOwner_admin_user_id()))
            && (this.getOwner_member_user_id() == null ? other.getOwner_member_user_id() == null : this.getOwner_member_user_id().equals(other.getOwner_member_user_id()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin_oauth_user
     *
     * @date
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAvatarUrl() == null) ? 0 : getAvatarUrl().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOauthPluginId() == null) ? 0 : getOauthPluginId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getOwner_admin_user_id() == null) ? 0 : getOwner_admin_user_id().hashCode());
        result = prime * result + ((getOwner_member_user_id() == null) ? 0 : getOwner_member_user_id().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plugin_oauth_user
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
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", name=").append(name);
        sb.append(", oauthPluginId=").append(oauthPluginId);
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", owner_admin_user_id=").append(owner_admin_user_id);
        sb.append(", owner_member_user_id=").append(owner_member_user_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}