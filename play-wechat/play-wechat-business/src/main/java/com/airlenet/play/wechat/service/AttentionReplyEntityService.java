package com.airlenet.play.wechat.service;

import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import com.airlenet.play.wechat.entity.AttentionReplyEntity;
import com.airlenet.play.wechat.entity.QAttentionReplyEntity;
import com.airlenet.play.wechat.repo.AttentionReplyEntityRepository;

/**
 * 关注回复
 *
 * @author lig
 */
@Service
public class AttentionReplyEntityService extends EntityService<AttentionReplyEntity, Long> {

    @Autowired
    private AttentionReplyEntityRepository attentionReplyEntityRepository;

    public AttentionReplyEntity findOneByWechatId(String wechatId) {
        return attentionReplyEntityRepository.findOne(QAttentionReplyEntity.attentionReplyEntity.config.wechatId.eq(wechatId));
    }
}
