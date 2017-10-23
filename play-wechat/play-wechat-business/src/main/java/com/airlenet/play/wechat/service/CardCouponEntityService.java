package com.airlenet.play.wechat.service;

import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import com.airlenet.play.wechat.entity.CardCouponEntity;
import com.airlenet.play.wechat.repo.CardCouponEntityRepository;

/**
 * 卡券管理
 *
 * @author lig
 */
@Service
public class CardCouponEntityService extends EntityService<CardCouponEntity, Long> {

    @Autowired
    private CardCouponEntityRepository cardCouponEntityRepository;
}
