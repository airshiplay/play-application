package com.airlenet.play.cms.service;

import java.util.Date;

import com.airlenet.play.cms.entity.SubscribeEntity;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.stereotype.Service;

@Service
public class SubscribeEntityService extends EntityService<SubscribeEntity, Long> {

    @Override
    public SubscribeEntity save(SubscribeEntity entity) {
        if (entity.isNew()) {
            entity.setCreatedDate(new Date());
        }
        return super.save(entity);
    }
}
