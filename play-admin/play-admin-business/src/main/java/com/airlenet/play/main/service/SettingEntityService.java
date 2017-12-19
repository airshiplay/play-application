package com.airlenet.play.main.service;

import com.airlenet.play.main.entity.PlaySettingMap;
import com.airlenet.play.main.entity.QSettingEntity;
import com.airlenet.play.main.entity.SettingEntity;
import com.airlenet.play.main.repo.SettingEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class SettingEntityService extends EntityService<SettingEntity, Long> {

    @Autowired
    private SettingEntityRepository settingEntityRepository;

    private PlaySettingMap settingMap;

    @Value("${config.default_language?:zh-CN}")
    private String defaultLanguage;

    public PlaySettingMap get() {
        if (settingMap == null) {
            List<SettingEntity> entityList = settingEntityRepository.findAll();
            if (settingMap == null) {
                settingMap = new PlaySettingMap();
                settingMap.put("config_default_language",defaultLanguage);
                Iterator<SettingEntity> resultItr = entityList.iterator();
                while (resultItr.hasNext()){
                    SettingEntity entity = resultItr.next();
                    if(!org.springframework.util.ObjectUtils.isEmpty(entity.getKey()))
                        settingMap.put(entity.getKey(),entity.getValue());
                }
            }
        }
        return settingMap;
    }

    public PlaySettingMap save(String code,PlaySettingMap map){
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            SettingEntity entity = settingEntityRepository.findOne(QSettingEntity.settingEntity.key.eq(entry.getKey()));
            if(entity==null){
                entity= new SettingEntity();
            }
            entity.setKey(entry.getKey());
            entity.setCode(code);
            entity.setValue(entry.getValue());
            settingEntityRepository.save(entity);
        }
        settingMap.putAll(map);
        Iterable<SettingEntity> settingEntities = settingEntityRepository.findAll(QSettingEntity.settingEntity.code.eq(code));
        Iterator<SettingEntity> resultItr = settingEntities.iterator();
        PlaySettingMap resultMap = new PlaySettingMap();
        while (resultItr.hasNext()){
            SettingEntity entity = resultItr.next();
            resultMap.put(entity.getKey(),entity.getValue());
        }
        return resultMap;
    }

}
