package com.airlenet.play.wechat.service;

import com.airlenet.play.wechat.entity.MemberCardEntity;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import com.airlenet.play.wechat.repo.MemberCardEntityRepository;

/**
 * 会员卡
 *
 * @author lig
 */
@Service
public class MemberCardEntityService extends EntityService<MemberCardEntity, Long> {

    @Autowired
    private MemberCardEntityRepository memberCardEntityRepository;
}
