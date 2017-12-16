package com.airlenet.play.main.entity;

import com.airlenet.repo.jpa.HierarchicalEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "sys_menu")
public class MenuEntity extends HierarchicalEntity<AdminUserEntity, Long, MenuEntity> {

    private static final long serialVersionUID = 2487374581329950331L;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String text;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50, unique = true)
    private String code;

    @Column(length = 50)
    private String iconCls;

    @Column(length = 100)
    private String view;

    @Column(length = 500)
    private String config;

    @OneToMany(mappedBy = "menu")
    private Set<MenuLangEntity> menuLang;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getView() {
        return view;
    }

    public void setView(String page) {
        this.view = page;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public Set<MenuLangEntity> getMenuLang() {
        return menuLang;
    }

    public void setMenuLang(Set<MenuLangEntity> menuLang) {
        this.menuLang = menuLang;
    }
}
