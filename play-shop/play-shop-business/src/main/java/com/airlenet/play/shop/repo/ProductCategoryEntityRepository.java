package com.airlenet.play.shop.repo;

import com.airlenet.play.shop.entity.ProductCategoryEntity;
import com.airlenet.repo.jpa.HierarchicalEntityRepository;

public interface ProductCategoryEntityRepository extends HierarchicalEntityRepository<ProductCategoryEntity, Long> {

}
