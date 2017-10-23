package com.airlenet.play.main.service;

import com.airlenet.play.main.api.LogService;
import com.airlenet.play.main.entity.LogEntity;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogEntityService extends EntityService<LogEntity, Long> {

    @Transactional
    public LogEntity addLog(String broswer, LogService.OperateType operateType, LogService.LogLevel level, String ip, String content) {
        LogEntity entity = new LogEntity();
        entity.setLevel(level);
        entity.setText(content);
        entity.setBrowser(broswer);
        entity.setIp(ip);
        entity.setOperateType(operateType);
        return save(entity);
    }

}
