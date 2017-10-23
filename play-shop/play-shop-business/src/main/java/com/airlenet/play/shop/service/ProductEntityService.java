package com.airlenet.play.shop.service;

import java.util.List;

import com.airlenet.play.shop.entity.ProductEntity;
import com.airlenet.play.shop.repo.ProductEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductEntityService extends EntityService<ProductEntity, Long> {

    @Autowired
    private ProductEntityRepository productEntityRepository;

    public List<ProductEntity> relatedProduct(ProductEntity self) {
        return productEntityRepository.findTop3ByProductCategoryAndIdNot(self.getProductCategory(), self.getId());
    }

}
