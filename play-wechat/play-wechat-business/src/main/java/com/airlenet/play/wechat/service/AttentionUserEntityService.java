package com.airlenet.play.wechat.service;

import com.airlenet.play.wechat.entity.AttentionUserEntity;
import com.airlenet.play.wechat.repo.AttentionUserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlenet.repo.jpa.EntityService;
import com.airlenet.play.wechat.entity.QAttentionUserEntity;

@Service
public class AttentionUserEntityService extends EntityService<AttentionUserEntity, Long> {

    @Autowired
    private AttentionUserEntityRepository wechatUserEntityRepository;

    public AttentionUserEntity findByAppidAndOpenId(String appid, String openid) {
        return wechatUserEntityRepository.findOne(QAttentionUserEntity.attentionUserEntity.openid.eq(openid).and(QAttentionUserEntity.attentionUserEntity.config.appId.eq(appid)));
    }

    public AttentionUserEntity findByWechatIdAndOpenId(String wechatId, String openid) {
        return wechatUserEntityRepository.findOne(QAttentionUserEntity.attentionUserEntity.openid.eq(openid).and(QAttentionUserEntity.attentionUserEntity.config.wechatId.eq(wechatId)));
    }
}
