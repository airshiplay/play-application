package com.airlenet.play.website.repo;

import com.airlenet.repo.jpa.EntityRepository;
import com.airlenet.play.website.entity.WebsiteConfigEntity;

public interface WebsiteConfigEntityRepository extends EntityRepository<WebsiteConfigEntity, Long> {

    WebsiteConfigEntity findTopByOrderByCreatedDateDesc();

}
