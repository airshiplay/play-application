package com.airlenet.play.plugin.oauth.repo;

import com.airlenet.play.plugin.oauth.model.OauthUserEntity;
import com.airlenet.repo.jpa.EntityRepository;

public interface OauthUserRepository extends EntityRepository<OauthUserEntity, Long> {

    OauthUserEntity findByOauthPluginIdAndUserId(String oauthPluginId, String userId);

}
