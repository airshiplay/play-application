package com.airlenet.play.main.repo;

import com.airlenet.repo.jpa.HierarchicalEntityRepository;
import com.airlenet.play.main.entity.MenuEntity;

public interface MenuEntityRepository extends HierarchicalEntityRepository<MenuEntity, Long> {

	MenuEntity findByCode(String code);

}
