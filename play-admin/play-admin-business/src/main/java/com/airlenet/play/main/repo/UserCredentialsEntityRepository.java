package com.airlenet.play.main.repo;

import com.airlenet.play.main.entity.UserCredentialsEntity;
import com.airlenet.repo.jpa.EntityRepository;

public interface UserCredentialsEntityRepository extends EntityRepository<UserCredentialsEntity, Long> {

    UserCredentialsEntity findByAccountAndType(String account, String type);

}
