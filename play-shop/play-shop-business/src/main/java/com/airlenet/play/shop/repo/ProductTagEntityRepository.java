package com.airlenet.play.shop.repo;

import com.airlenet.play.shop.entity.ProductTagEntity;
import com.airlenet.play.shop.entity.QProductTagEntity;
import com.airlenet.repo.jpa.EntityRepository;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

public interface ProductTagEntityRepository extends EntityRepository<ProductTagEntity, Long>, QuerydslBinderCustomizer<QProductTagEntity> {

    @Override
    default void customize(QuerydslBindings bindings, QProductTagEntity root) {
        bindings.bind(root.name).first((path, value) -> path.contains(value));
    }
}
