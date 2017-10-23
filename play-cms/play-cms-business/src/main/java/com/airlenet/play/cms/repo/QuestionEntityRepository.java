package com.airlenet.play.cms.repo;

import com.airlenet.play.cms.entity.QuestionEntity;
import com.airlenet.repo.jpa.EntityRepository;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

import com.airlenet.play.cms.entity.QQuestionEntity;

public interface QuestionEntityRepository extends EntityRepository<QuestionEntity, Long>, QuerydslBinderCustomizer<QQuestionEntity> {

    @Override
    default void customize(QuerydslBindings bindings, QQuestionEntity root) {
        bindings.bind(root.title).first((path, value) -> path.contains(value));
    }

}
