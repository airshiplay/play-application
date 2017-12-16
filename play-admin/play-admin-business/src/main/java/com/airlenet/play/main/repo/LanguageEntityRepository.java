package com.airlenet.play.main.repo;

import com.airlenet.play.main.entity.LanguageEntity;
import com.airlenet.repo.jpa.EntityRepository;

/**
 * @author airlenet
 * @version 2017-12-15
 */
public interface LanguageEntityRepository extends EntityRepository<LanguageEntity, Long> {

//    @Override
//    default public void customize(QuerydslBindings bindings, QLogEntity root) {
//        bindings.bind(root.text).first((path, value) -> path.containsIgnoreCase(value));
//    }
}