package com.airlenet.play.wechat.service;

import com.airlenet.play.wechat.repo.WechatConfigEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlenet.repo.jpa.EntityService;
import com.airlenet.play.wechat.entity.QWechatConfigEntity;
import com.airlenet.play.wechat.entity.WechatConfigEntity;

@Service
public class WechatConfigEntityService extends EntityService<WechatConfigEntity, Long> {

    @Autowired
    private WechatConfigEntityRepository wechatConfigEntityRepository;

    public WechatConfigEntity findConfigByAppid(String appid) {
        return wechatConfigEntityRepository.findOne(QWechatConfigEntity.wechatConfigEntity.appId.eq(appid));
    }
}
