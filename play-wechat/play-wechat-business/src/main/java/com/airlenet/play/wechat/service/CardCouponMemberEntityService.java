package com.airlenet.play.wechat.service;

import com.airlenet.play.wechat.entity.CardCouponMemberEntity;
import com.airlenet.play.wechat.repo.CardCouponMemberEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 会员卡券
 *
 * @author lig
 */
@Service
public class CardCouponMemberEntityService extends EntityService<CardCouponMemberEntity, Long> {

    @Autowired
    private CardCouponMemberEntityRepository cardCouponMemberEntityRepository;
}
