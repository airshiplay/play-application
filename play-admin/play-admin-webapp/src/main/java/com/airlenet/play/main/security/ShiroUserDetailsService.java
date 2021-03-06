package com.airlenet.play.main.security;

import com.airlenet.play.main.entity.*;
import com.airlenet.play.main.repo.AuthorityEntityRespository;
import com.airlenet.play.main.repo.MemberUserEntityRepository;
import com.airlenet.play.main.repo.RoleEntityRepository;
import com.airlenet.security.shiro.PlayShiroUserDetailsService;
import com.airlenet.play.main.repo.AdminUserEntityRepository;
import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//package com.airshiplay.play.main.security;
//
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.airshiplay.play.security.CustomUserDetails;
//

@Service
public class ShiroUserDetailsService implements PlayShiroUserDetailsService {

    @Autowired
    private AdminUserEntityRepository adminUserEntityRepository;

    @Autowired
    private MemberUserEntityRepository memberUserEntityRepository;

    @Autowired
    private RoleEntityRepository roleEntityRepository;
    @Autowired
    private AuthorityEntityRespository authorityEntityRespository;
    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional(readOnly = true,value = "transactionManager")
    public AdminUserDetails findByUsername(String username) {
        AdminUserEntity userEntity = adminUserEntityRepository.findByUsername(username);
        if (userEntity == null) {
            return null;
        }
        return new AdminUserDetails(userEntity.getId(), userEntity.getUsername(), userEntity.getUsername(), userEntity.getPassword(), userEntity.getSalt(), userEntity.isEnabled(),
                !userEntity.isAccountExpired(), !userEntity.isCredentialsExpired(), !userEntity.isLocked());
    }

    @Override
    public AdminUserDetails findAdminUserByUsername(String username) {
        AdminUserEntity userEntity = adminUserEntityRepository.findByUsername(username);
        if (userEntity == null) {
            return null;
        }
        return new AdminUserDetails(userEntity.getId(), userEntity.getUsername(), userEntity.getUsername(), userEntity.getPassword(), userEntity.getSalt(), userEntity.isEnabled(),
                !userEntity.isAccountExpired(), !userEntity.isCredentialsExpired(), !userEntity.isLocked());
    }

    @Override
    public MemberUserDetails findMemberUserByUsername(String username) {
        MemberUserEntity userEntity = memberUserEntityRepository.findByUsername(username);
        if (userEntity == null) {
            return null;
        }
        return new MemberUserDetails(userEntity.getId(), userEntity.getUsername(), userEntity.getUsername(), userEntity.getPassword(), userEntity.getSalt(), userEntity.isEnabled(),
                !userEntity.isAccountExpired(), !userEntity.isCredentialsExpired(), !userEntity.isLocked());
    }

    //

    @Transactional(readOnly = true,value = "transactionManager")
    @Override
    public Set<String> findRoles(String username, Serializable uid) {
        Iterator<RoleEntity> result = roleEntityRepository.findAll(QRoleEntity.roleEntity.users.any().id.eq((Long) uid)).iterator();
        Set<String> sets = new HashSet<String>();
        while (result.hasNext()) {
            RoleEntity roleEntity = (RoleEntity) result.next();
            sets.add(roleEntity.getCode());
        }
        return sets;//Sets.newHashSet("admin");
    }

    @Transactional(readOnly = true,value = "transactionManager")
    @Override
    public Set<String> findPermissions(String username, Serializable uid) {

        Iterator<PermissionEntity> result = authorityEntityRespository.findAll(QPermissionEntity.permissionEntity.roles.any().users.any().id.eq((Long) uid)).iterator();

        Set<String> sets = new HashSet<String>();
        while (result.hasNext()) {
            PermissionEntity roleEntity = (PermissionEntity) result.next();
            sets.add(roleEntity.getPermission());
        }
        return sets;// Sets.newHashSet("*:*:*:*");//
        // 资源标识符:操作:对象实例ID
    }

    @Override
    public Set<String> findAdminPermissions(String username, Serializable uid) {
        // ////superadmin 角色用户，拥有超级权限
        Iterable<RoleEntity> roles = roleEntityRepository.findAll(QRoleEntity.roleEntity.users.any().id.eq((Long) uid).and(QRoleEntity.roleEntity.code.eq("superadmin")));
        if (roles.iterator().hasNext()) {
            return Sets.newHashSet("*");
        }
        Iterator<PermissionEntity> result = authorityEntityRespository.findAll(QPermissionEntity.permissionEntity.roles.any().users.any().id.eq((Long) uid)).iterator();
        Set<String> sets = new HashSet<String>();
        while (result.hasNext()) {
            PermissionEntity roleEntity = (PermissionEntity) result.next();
            sets.add(roleEntity.getPermission());
        }
        return sets;// Sets.newHashSet("*:*:*:*");//
        // 资源标识符:操作:对象实例ID
    }

    @Override
    public Set<String> findAdminRoles(String username, Serializable uid) {
        Iterator<RoleEntity> result = roleEntityRepository.findAll(QRoleEntity.roleEntity.users.any().id.eq((Long) uid)).iterator();
        Set<String> sets = new HashSet<String>();
        while (result.hasNext()) {
            RoleEntity roleEntity = (RoleEntity) result.next();
            sets.add(roleEntity.getCode());
        }
        return sets;
    }

    @Override
    public Set<String> findMemberPermissions(String username, Serializable uid) {
        return Sets.newHashSet();
    }

    @Override
    public Set<String> findMemberRoles(String username, Serializable uid) {
        return Sets.newHashSet("user");
    }

}
