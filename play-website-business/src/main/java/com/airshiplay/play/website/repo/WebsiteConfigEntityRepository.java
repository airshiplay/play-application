package com.airshiplay.play.website.repo;

import com.airlenet.repo.jpa.EntityRepository;
import com.airshiplay.play.website.entity.WebsiteConfigEntity;

public interface WebsiteConfigEntityRepository extends EntityRepository<WebsiteConfigEntity, Long> {

	WebsiteConfigEntity findTopByOrderByCreatedDateDesc();

}
