package com.airshiplay.play.website.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * database table sys_setting
 *
 * @date do_not_delete_during_merge
 */
public class SysSetting implements Serializable {
    private Long id;

    private Date createdDate;

    private Date lastModifiedDate;

    private String address;

    private String adminLoginBanner;

    private String certtext;

    private String contact;

    private String email;

    private String hotSearch;

    private Boolean isSiteEnabled;

    private String logo;

    private String phone1;

    private String phone2;

    private String shortSiteName;

    private String siteCloseMessage;

    private String siteName;

    private String zipCode;

    private Long createdBy_id;

    private Long lastModifiedBy_id;

    private String introduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_setting
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAdminLoginBanner() {
        return adminLoginBanner;
    }

    public void setAdminLoginBanner(String adminLoginBanner) {
        this.adminLoginBanner = adminLoginBanner == null ? null : adminLoginBanner.trim();
    }

    public String getCerttext() {
        return certtext;
    }

    public void setCerttext(String certtext) {
        this.certtext = certtext == null ? null : certtext.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getHotSearch() {
        return hotSearch;
    }

    public void setHotSearch(String hotSearch) {
        this.hotSearch = hotSearch == null ? null : hotSearch.trim();
    }

    public Boolean getIsSiteEnabled() {
        return isSiteEnabled;
    }

    public void setIsSiteEnabled(Boolean isSiteEnabled) {
        this.isSiteEnabled = isSiteEnabled;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1 == null ? null : phone1.trim();
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    public String getShortSiteName() {
        return shortSiteName;
    }

    public void setShortSiteName(String shortSiteName) {
        this.shortSiteName = shortSiteName == null ? null : shortSiteName.trim();
    }

    public String getSiteCloseMessage() {
        return siteCloseMessage;
    }

    public void setSiteCloseMessage(String siteCloseMessage) {
        this.siteCloseMessage = siteCloseMessage == null ? null : siteCloseMessage.trim();
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_setting
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
        SysSetting other = (SysSetting) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
            && (this.getLastModifiedDate() == null ? other.getLastModifiedDate() == null : this.getLastModifiedDate().equals(other.getLastModifiedDate()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAdminLoginBanner() == null ? other.getAdminLoginBanner() == null : this.getAdminLoginBanner().equals(other.getAdminLoginBanner()))
            && (this.getCerttext() == null ? other.getCerttext() == null : this.getCerttext().equals(other.getCerttext()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getHotSearch() == null ? other.getHotSearch() == null : this.getHotSearch().equals(other.getHotSearch()))
            && (this.getIsSiteEnabled() == null ? other.getIsSiteEnabled() == null : this.getIsSiteEnabled().equals(other.getIsSiteEnabled()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getPhone1() == null ? other.getPhone1() == null : this.getPhone1().equals(other.getPhone1()))
            && (this.getPhone2() == null ? other.getPhone2() == null : this.getPhone2().equals(other.getPhone2()))
            && (this.getShortSiteName() == null ? other.getShortSiteName() == null : this.getShortSiteName().equals(other.getShortSiteName()))
            && (this.getSiteCloseMessage() == null ? other.getSiteCloseMessage() == null : this.getSiteCloseMessage().equals(other.getSiteCloseMessage()))
            && (this.getSiteName() == null ? other.getSiteName() == null : this.getSiteName().equals(other.getSiteName()))
            && (this.getZipCode() == null ? other.getZipCode() == null : this.getZipCode().equals(other.getZipCode()))
            && (this.getCreatedBy_id() == null ? other.getCreatedBy_id() == null : this.getCreatedBy_id().equals(other.getCreatedBy_id()))
            && (this.getLastModifiedBy_id() == null ? other.getLastModifiedBy_id() == null : this.getLastModifiedBy_id().equals(other.getLastModifiedBy_id()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_setting
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
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAdminLoginBanner() == null) ? 0 : getAdminLoginBanner().hashCode());
        result = prime * result + ((getCerttext() == null) ? 0 : getCerttext().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getHotSearch() == null) ? 0 : getHotSearch().hashCode());
        result = prime * result + ((getIsSiteEnabled() == null) ? 0 : getIsSiteEnabled().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getPhone1() == null) ? 0 : getPhone1().hashCode());
        result = prime * result + ((getPhone2() == null) ? 0 : getPhone2().hashCode());
        result = prime * result + ((getShortSiteName() == null) ? 0 : getShortSiteName().hashCode());
        result = prime * result + ((getSiteCloseMessage() == null) ? 0 : getSiteCloseMessage().hashCode());
        result = prime * result + ((getSiteName() == null) ? 0 : getSiteName().hashCode());
        result = prime * result + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        result = prime * result + ((getCreatedBy_id() == null) ? 0 : getCreatedBy_id().hashCode());
        result = prime * result + ((getLastModifiedBy_id() == null) ? 0 : getLastModifiedBy_id().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_setting
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
        sb.append(", address=").append(address);
        sb.append(", adminLoginBanner=").append(adminLoginBanner);
        sb.append(", certtext=").append(certtext);
        sb.append(", contact=").append(contact);
        sb.append(", email=").append(email);
        sb.append(", hotSearch=").append(hotSearch);
        sb.append(", isSiteEnabled=").append(isSiteEnabled);
        sb.append(", logo=").append(logo);
        sb.append(", phone1=").append(phone1);
        sb.append(", phone2=").append(phone2);
        sb.append(", shortSiteName=").append(shortSiteName);
        sb.append(", siteCloseMessage=").append(siteCloseMessage);
        sb.append(", siteName=").append(siteName);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", createdBy_id=").append(createdBy_id);
        sb.append(", lastModifiedBy_id=").append(lastModifiedBy_id);
        sb.append(", introduction=").append(introduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}