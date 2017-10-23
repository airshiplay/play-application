package com.airlenet.play.oauth2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlenet.repo.jpa.EntityService;
import com.airlenet.play.oauth2.entity.AccessTokenEntity;
import com.airlenet.play.oauth2.repo.AccessTokenEntityRepository;

@Service
public class AccessTokenEntityService extends EntityService<AccessTokenEntity, Long> {
    @Autowired
    private AccessTokenEntityRepository appEntityRepository;


    @Override
    public AccessTokenEntity save(AccessTokenEntity entity) {
        return super.save(entity);
    }

    public AccessTokenEntity findOneByTokenId(String accesstoken) {
        return appEntityRepository.findOneByTokenId(accesstoken);
    }
}
