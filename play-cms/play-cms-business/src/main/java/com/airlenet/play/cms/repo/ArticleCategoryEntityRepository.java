package com.airlenet.play.cms.repo;

import com.airlenet.play.cms.entity.ArticleCategoryEntity;
import com.airlenet.play.cms.entity.QArticleCategoryEntity;
import com.airlenet.repo.jpa.HierarchicalEntityRepository;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

public interface ArticleCategoryEntityRepository extends HierarchicalEntityRepository<ArticleCategoryEntity, Long>, QuerydslBinderCustomizer<QArticleCategoryEntity> {

    @Override
    default public void customize(QuerydslBindings bindings,
                                  QArticleCategoryEntity root) {
        bindings.bind(root.name).first((path, value) -> path.containsIgnoreCase(value));
        bindings.bind(root.seoTitle).first((path, value) -> path.containsIgnoreCase(value));
        bindings.bind(root.seoKeywords).first((path, value) -> path.containsIgnoreCase(value));
        bindings.bind(root.seoDescription).first((path, value) -> path.containsIgnoreCase(value));
    }

}
