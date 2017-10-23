package com.airlenet.play.cms.repo;

import java.util.List;

import com.airlenet.play.cms.entity.ArticleEntity;
import com.airlenet.play.cms.entity.QArticleEntity;
import com.airlenet.repo.jpa.EntityRepository;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

public interface ArticleEntityRepository extends EntityRepository<ArticleEntity, Long>, QuerydslBinderCustomizer<QArticleEntity> {

    List<ArticleEntity> findTop2ByOrderByCreatedDateDesc();

    @Override
    default void customize(QuerydslBindings bindings, QArticleEntity root) {
        bindings.bind(root.title).first((path, value) -> path.contains(value));
    }

}
