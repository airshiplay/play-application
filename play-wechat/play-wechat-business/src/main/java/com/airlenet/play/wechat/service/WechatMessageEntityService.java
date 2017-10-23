package com.airlenet.play.wechat.service;

import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.airlenet.play.wechat.entity.WechatMessageEntity;
import com.airlenet.play.wechat.repo.WechatMessageEntityRepository;

/**
 * 消息管理
 *
 * @author lig
 */
@Service
public class WechatMessageEntityService extends EntityService<WechatMessageEntity, Long> {

    @Autowired
    private WechatMessageEntityRepository wechatMessageEntityRepository;
}
