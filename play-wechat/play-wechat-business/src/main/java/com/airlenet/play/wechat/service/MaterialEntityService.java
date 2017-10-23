package com.airlenet.play.wechat.service;

import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlenet.play.wechat.entity.MaterialEntity;
import com.airlenet.play.wechat.repo.MaterialEntityRepository;

/**
 * 素材
 *
 * @author lig
 */
@Service
public class MaterialEntityService extends EntityService<MaterialEntity, Long> {

    @Autowired
    private MaterialEntityRepository materialEntityRepository;
}
