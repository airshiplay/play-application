package com.airlenet.play.wechat.repo;

import com.airlenet.play.wechat.entity.CardCouponEntity;
import com.airlenet.repo.jpa.EntityRepository;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

 import com.airlenet.play.wechat.entity.QCardCouponEntity;

public interface CardCouponEntityRepository extends EntityRepository<CardCouponEntity, Long>, QuerydslBinderCustomizer<QCardCouponEntity> {
    @Override
    default void customize(QuerydslBindings bindings, QCardCouponEntity root) {
        bindings.bind(root.title).first((path, value) -> path.contains(value));
    }
}
