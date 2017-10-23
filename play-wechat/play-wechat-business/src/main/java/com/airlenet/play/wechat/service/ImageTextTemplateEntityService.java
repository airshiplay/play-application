package com.airlenet.play.wechat.service;

import com.airlenet.play.wechat.entity.ImageTextTemplateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlenet.repo.jpa.EntityService;
import com.airlenet.play.wechat.repo.ImageTextTemplateEntityRepository;

/**
 * 图文消息
 *
 * @author lig
 */
@Service
public class ImageTextTemplateEntityService extends EntityService<ImageTextTemplateEntity, Long> {

    @Autowired
    private ImageTextTemplateEntityRepository imageTextTemplateEntityRepository;
}
