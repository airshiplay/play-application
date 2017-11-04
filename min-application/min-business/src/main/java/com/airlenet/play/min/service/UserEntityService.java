package com.airlenet.play.min.service;

import com.airlenet.play.min.entity.QUserEntity;
import com.airlenet.play.min.entity.UserEntity;
import com.airlenet.repo.jpa.EntityService;
import com.airlenet.security.CustomUserDetails;
import com.airlenet.security.shiro.PlayShiroUserDetailsService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Set;

/**
 * @author airlenet
 * @version 2017-11-04
 */
@Service
public class UserEntityService extends EntityService<UserEntity,Long> implements PlayShiroUserDetailsService {


    public UserEntity getUserByName(String name){
        return findOne(QUserEntity.userEntity.name.eq(name));
    }

    /**
     * 根据用户名查找用户
     *
     * @param username
     * @return
     */
    public CustomUserDetails<?, ?> findByUsername(String username) {
        return null;
    }

    public CustomUserDetails<?, ?> findAdminUserByUsername(String username) {
        return null;
    }

    public CustomUserDetails<?, ?> findMemberUserByUsername(String username) {
        return null;
    }

    public Set<String> findRoles(String username, Serializable uid) {
        return null;
    }

    public Set<String> findAdminRoles(String username, Serializable uid) {
        return null;
    }

    public Set<String> findMemberRoles(String username, Serializable uid) {
        return null;
    }

    public Set<String> findPermissions(String username, Serializable uid) {
        return null;
    }

    public Set<String> findAdminPermissions(String username, Serializable uid) {
        return null;
    }

    public Set<String> findMemberPermissions(String username, Serializable uid) {
        return null;
    }
}
