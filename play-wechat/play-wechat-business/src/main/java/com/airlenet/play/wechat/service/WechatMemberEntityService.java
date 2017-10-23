package com.airlenet.play.wechat.service;

import com.airlenet.play.wechat.entity.WechatMemberEntity;
import com.airlenet.play.wechat.repo.WechatMemberEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 微信会员
 *
 * @author lig
 */
@Service
public class WechatMemberEntityService extends EntityService<WechatMemberEntity, Long> {

    @Autowired
    private WechatMemberEntityRepository wechatMemberEntityRepository;
}
