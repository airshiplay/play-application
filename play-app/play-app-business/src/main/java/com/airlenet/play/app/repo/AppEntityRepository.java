package com.airlenet.play.app.repo;

import com.airlenet.play.app.entity.AppEntity;
import com.airlenet.repo.jpa.EntityRepository;

public interface AppEntityRepository extends
        EntityRepository<AppEntity, Long> {

}