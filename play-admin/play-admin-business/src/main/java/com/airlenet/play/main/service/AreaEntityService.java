package com.airlenet.play.main.service;

import com.airlenet.play.main.entity.AreaEntity;
import com.airlenet.play.main.repo.AreaEntityRepository;
import com.airlenet.repo.jpa.HierarchicalEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AreaEntityService extends HierarchicalEntityService<AreaEntity, Long> {

    @Autowired
    private AreaEntityRepository areaEntityRepository;

    @Transactional(readOnly = true)
    public AreaEntity findByFullNameAndType(String fullName, AreaEntity.AreaType type) {
        return areaEntityRepository.findByFullNameAndType(fullName, type);
    }
}
