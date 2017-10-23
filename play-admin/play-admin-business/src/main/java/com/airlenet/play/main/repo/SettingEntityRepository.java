package com.airlenet.play.main.repo;

import com.airlenet.play.main.entity.SettingEntity;
import com.airlenet.repo.jpa.EntityRepository;

public interface SettingEntityRepository extends EntityRepository<SettingEntity, Long> {

	SettingEntity findTopByOrderByCreatedDateDesc();
	
}
