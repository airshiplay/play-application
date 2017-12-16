package com.airlenet.play.main.entity;

import com.airlenet.repo.jpa.DataEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author airlenet
 * @version 2017-12-15
 */
@Entity
@Table(name = "sys_menu_lang")
public class MenuLangEntity extends DataEntity<AdminUserEntity,Long>{
    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_id")
    private LanguageEntity language;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    private MenuEntity menu;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LanguageEntity getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEntity language) {
        this.language = language;
    }

    public MenuEntity getMenu() {
        return menu;
    }

    public void setMenu(MenuEntity menu) {
        this.menu = menu;
    }
}
