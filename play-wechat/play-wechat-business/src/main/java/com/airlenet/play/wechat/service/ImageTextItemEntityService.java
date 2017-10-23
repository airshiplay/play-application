package com.airlenet.play.wechat.service;

import com.airlenet.play.wechat.entity.ImageTextItemEntity;
import com.airlenet.play.wechat.repo.ImageTextItemEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 图文子集
 *
 * @author lig
 */
@Service
public class ImageTextItemEntityService extends EntityService<ImageTextItemEntity, Long> {

    @Autowired
    private ImageTextItemEntityRepository imageTextItemEntityRepository;
}
