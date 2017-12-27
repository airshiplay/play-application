package com.airlenet.play.main.service;

import com.airlenet.play.main.entity.PermissionEntity;
import com.airlenet.play.main.entity.QPermissionEntity;
import com.airlenet.play.main.entity.RoleEntity;
import com.airlenet.play.main.repo.AuthorityEntityRespository;
import com.airlenet.play.main.repo.RoleEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class PermissionEntityService extends
        EntityService<PermissionEntity, Long> {

    @Autowired
    private AuthorityEntityRespository authorityEntityRespository;

    @Autowired
    private RoleEntityRepository roleEntityRespository;

    public Iterable<PermissionEntity> findAuthoritiesByMenuId(Long menuId) {
        return authorityEntityRespository
                .findAll(QPermissionEntity.permissionEntity.menu.id.eq(menuId));
    }

    public Iterable<PermissionEntity> findAuthoritiesByMenuIdAndType(
            Long menuId, PermissionEntity.PermissionType type) {
        return authorityEntityRespository
                .findAll(QPermissionEntity.permissionEntity.menu.id.eq(menuId)
                        .and(QPermissionEntity.permissionEntity.type.eq(type)));
    }

    public List<PermissionEntity> findAuthoritiesByRoleId(Long roleId) {
        return roleEntityRespository.findOne(roleId).getAuthorities();
    }

    public Iterable<RoleEntity> findPermissionByUid(Long uid){
        return roleEntityRespository.findAll(QPermissionEntity.permissionEntity.roles.any().users.any().id.eq((Long) uid));
    }

}
