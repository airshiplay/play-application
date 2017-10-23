package com.airlenet.play.main.repo;

import com.airlenet.play.main.entity.QAreaEntity;
import com.airlenet.repo.jpa.HierarchicalEntityRepository;
import com.airlenet.play.main.entity.AreaEntity;
import com.airlenet.play.main.entity.AreaEntity.AreaType;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

public interface AreaEntityRepository extends HierarchicalEntityRepository<AreaEntity, Long>,QuerydslBinderCustomizer<QAreaEntity> {

	AreaEntity findByFullNameAndType(String fullName,AreaType type);

	@Override
	default public void customize(QuerydslBindings bindings, QAreaEntity root){
		bindings.bind(root.fullName).first((path,value) ->path.contains(value));
	}
}
