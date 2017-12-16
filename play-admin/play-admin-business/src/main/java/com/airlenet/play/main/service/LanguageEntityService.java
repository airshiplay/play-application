package com.airlenet.play.main.service;

import com.airlenet.play.main.entity.LanguageEntity;
import com.airlenet.play.main.repo.LanguageEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author airlenet
 * @version 2017-12-15
 */
@Service
public class LanguageEntityService extends EntityService<LanguageEntity,Long> {
    @Autowired
    private LanguageEntityRepository languageEntityRepository;
}
