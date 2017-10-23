package com.airlenet.play.wechat.service;

import com.airlenet.play.wechat.entity.TextTemplateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlenet.repo.jpa.EntityService;
import com.airlenet.play.wechat.repo.TextTemplateEntityRepository;

/**
 * 文本消息
 *
 * @author lig
 */
@Service
public class TextTemplateEntityService extends EntityService<TextTemplateEntity, Long> {

    @Autowired
    private TextTemplateEntityRepository textTemplateEntityRepository;
}
