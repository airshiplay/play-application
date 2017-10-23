package com.airlenet.play.wechat.service;

import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import com.airlenet.play.wechat.entity.WechatKfEntity;
import com.airlenet.play.wechat.repo.WechatKfEntityRepository;

/**
 * 微信客服
 *
 * @author lig
 */
@Service
public class WechatKfEntityService extends EntityService<WechatKfEntity, Long> {

    @Autowired
    private WechatKfEntityRepository wechatKfEntityRepository;
}
