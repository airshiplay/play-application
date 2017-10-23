package com.airlenet.play.oauth2.repo;

import com.airlenet.play.oauth2.entity.AccessTokenEntity;
import com.airlenet.repo.jpa.EntityRepository;

public interface AccessTokenEntityRepository extends
        EntityRepository<AccessTokenEntity, Long> {
    public AccessTokenEntity findOneByTokenId(String tokenId);
}