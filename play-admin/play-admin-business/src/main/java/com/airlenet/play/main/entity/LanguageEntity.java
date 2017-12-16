package com.airlenet.play.main.entity;

import com.airlenet.play.main.util.LanguageStatus;
import com.airlenet.repo.jpa.SortEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author airlenet
 * @version 2017-12-15
 */
@Entity
@Table(name = "sys_language")
public class LanguageEntity  extends SortEntity<AdminUserEntity, Long> {

    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String name;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50, unique = true)
    private String code;

    @Column(length = 100)
    @Size(max = 50)
    private String local;

    @Column(length = 100)
    private String image;

    @Enumerated()
    private LanguageStatus status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String locale) {
        this.local = locale;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LanguageStatus getStatus() {
        return status;
    }

    public void setStatus(LanguageStatus status) {
        this.status = status;
    }
}
