package com.airlenet.play.website.service;

import com.airlenet.play.website.entity.WebsiteConfigEntity;
import com.airlenet.play.website.repo.WebsiteConfigEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 网站配置
 *
 * @author lig
 */
@Service
public class WebsiteConfigEntityService extends EntityService<WebsiteConfigEntity, Long> {

    @Autowired
    private WebsiteConfigEntityRepository websiteConfigEntityRepository;

    private WebsiteConfigEntity settingEntity;

    @Value("${website.seoTitle?:艾尔里信息科技}")
    private String seoTitle;
    @Value("${website.seoKeywords?:艾尔里信息科技}")
    private String seoKeywords;
    @Value("${website.seoDescription?:艾尔里信息科技有限公司}")
    private String seoDescription;

    public WebsiteConfigEntity get() {
        if (settingEntity == null) {
            settingEntity = websiteConfigEntityRepository.findTopByOrderByCreatedDateDesc();
            if (settingEntity == null) {
                settingEntity = new WebsiteConfigEntity();
                settingEntity.setSeoDescription(seoDescription);
                settingEntity.setSeoKeywords(seoKeywords);
                settingEntity.setSeoTitle(seoTitle);
            }
        }
        return settingEntity;
    }

    @Override
    public WebsiteConfigEntity save(WebsiteConfigEntity entity) {
        settingEntity = super.save(entity);
        return settingEntity;
    }
}
