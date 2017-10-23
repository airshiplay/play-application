package com.airlenet.play.wechat.service;

import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import com.airlenet.play.wechat.entity.AttentionUserSubscribeEntity;
import com.airlenet.play.wechat.repo.AttentionUserSubscribeEntityRepository;

/**
 * 关注用户 时间
 *
 * @author lig
 */
@Service
public class AttentionUserSubscribeEntityService extends EntityService<AttentionUserSubscribeEntity, Long> {

    @Autowired
    private AttentionUserSubscribeEntityRepository attentionUserSubscribeEntityRepository;
}
