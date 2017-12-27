package com.airlenet.play.main.repo;

import com.airlenet.repo.jpa.EntityRepository;
import com.airlenet.play.main.entity.PermissionEntity;

public interface AuthorityEntityRespository extends
        EntityRepository<PermissionEntity, Long> {

}
