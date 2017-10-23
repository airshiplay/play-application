package com.airlenet.play.main.service;

import com.airlenet.play.main.entity.SettingEntity;
import com.airlenet.play.main.repo.SettingEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingEntityService extends EntityService<SettingEntity, Long> {

    @Autowired
    private SettingEntityRepository settingEntityRepository;

    private SettingEntity settingEntity;

    public SettingEntity get() {
        if (settingEntity == null) {
            settingEntity = settingEntityRepository.findTopByOrderByCreatedDateDesc();
            if (settingEntity == null) {
                settingEntity = new SettingEntity();
            }
        }
        return settingEntity;
    }

    @Override
    public SettingEntity save(SettingEntity entity) {
        settingEntity = super.save(entity);
        return settingEntity;
    }

}
