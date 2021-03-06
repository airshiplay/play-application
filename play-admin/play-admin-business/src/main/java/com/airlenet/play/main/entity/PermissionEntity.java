package com.airlenet.play.main.entity;

import com.airlenet.repo.jpa.SortEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sys_permission")
public class PermissionEntity extends SortEntity<AdminUserEntity, Long> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private PermissionType type;
    /**
     * 菜单读权限
     */
    @Column(length = 20)
    @Size(max = 10)
    private String name;
    /**
     * sys:menu:view
     */
    @Column(name = "permission")
    private String permission;

    @ManyToOne
    private MenuEntity menu;

    @ManyToMany(mappedBy = "authorities", fetch = FetchType.LAZY)
    private Set<RoleEntity> roles = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuEntity getMenu() {
        return menu;
    }

    public void setMenu(MenuEntity menu) {
        this.menu = menu;
    }

    public PermissionType getType() {
        return type;
    }

    public void setType(PermissionType type) {
        this.type = type;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public enum PermissionType {
        /**
         * 页面授权
         */
        page, /**
         * 数据授权
         */
        data, /**
         * 页面数据授权
         */
        all
    }
}
