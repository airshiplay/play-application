package com.airlenet.play.main.service;

import com.airlenet.play.main.entity.AdminUserEntity;
import com.airlenet.repo.jpa.EntityService;
import com.airlenet.play.main.repo.AdminUserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserEntityService extends EntityService<AdminUserEntity, Long> {

    @Autowired
    private AdminUserEntityRepository userEntityRepository;

    @Transactional(readOnly = true,value = "transactionManager")
    public AdminUserEntity findByUsername(String username) {
        return userEntityRepository.findByUsername(username);
    }

    @Transactional(readOnly = true,value = "transactionManager")
    public AdminUserEntity findByEmail(String email) {
        return userEntityRepository.findByEmail(email);
    }

    @Transactional(readOnly = true,value = "transactionManager")
    public AdminUserEntity findByMobile(String mobile) {
        return userEntityRepository.findByMobile(mobile);
    }

}
