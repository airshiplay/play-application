package com.airlenet.play.main.repo;

import com.airlenet.repo.jpa.HierarchicalEntityRepository;
import com.airlenet.play.main.entity.DictEntity;

import java.util.List;

public interface DictEntityRepository extends
		HierarchicalEntityRepository<DictEntity, Long> {
	List<DictEntity> findByType(String type);

	int countByType(String type);

}
