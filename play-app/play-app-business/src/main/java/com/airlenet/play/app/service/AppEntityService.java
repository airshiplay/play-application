package com.airlenet.play.app.service;

import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airlenet.play.app.entity.AppEntity;
import com.airlenet.play.app.entity.AppEntity.Platform;
import com.airlenet.play.app.entity.QAppEntity;
import com.airlenet.play.app.repo.AppEntityRepository;
import com.airlenet.play.main.entity.QAdminUserEntity;

@Service
public class AppEntityService extends EntityService<AppEntity, Long> {
    @Autowired
    private AppEntityRepository appEntityRepository;

    public void test() {
        QAppEntity appEntity = QAppEntity.appEntity;
        QAdminUserEntity.adminUserEntity.area.name.eq("");

        appEntityRepository.findAll(appEntity.platform.eq(Platform.android));

    }

    @Override
    public AppEntity save(AppEntity entity) {
        return super.save(entity);
    }
}
