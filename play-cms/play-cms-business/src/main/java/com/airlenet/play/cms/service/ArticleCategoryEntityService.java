package com.airlenet.play.cms.service;

import com.airlenet.repo.jpa.HierarchicalEntityService;
import org.springframework.stereotype.Service;

import com.airlenet.play.cms.entity.ArticleCategoryEntity;

@Service
public class ArticleCategoryEntityService extends HierarchicalEntityService<ArticleCategoryEntity, Long> {

}
