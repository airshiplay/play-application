package com.airlenet.play.cms.service;

import java.util.List;

import com.airlenet.play.cms.entity.AdEntity;
import com.airlenet.play.cms.entity.QAdEntity;
import com.airlenet.play.cms.repo.AdEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QSort;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service
public class AdEntityService extends EntityService<AdEntity, Long> {
    @Autowired
    AdEntityRepository adEntityRepository;

    public List<AdEntity> findTop3(String positionCode, AdEntity.Type type) {
        return Lists.newArrayList(adEntityRepository.findAll(
                QAdEntity.adEntity.type.eq(AdEntity.Type.image).and(
                        QAdEntity.adEntity.adPosition.code.eq(positionCode)),
                new PageRequest(0, 3, new QSort(QAdEntity.adEntity.sortNo.asc(), QAdEntity.adEntity.createdDate
                        .desc()))).getContent());
    }
}
