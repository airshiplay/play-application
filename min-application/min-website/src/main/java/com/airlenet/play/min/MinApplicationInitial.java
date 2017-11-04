package com.airlenet.play.min;

import com.airlenet.integration.core.ApplicationInitializer;
import com.airlenet.play.min.entity.UserEntity;
import com.airlenet.play.min.service.UserEntityService;
import com.airlenet.security.PlayPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author airlenet
 * @version 2017-11-04
 */
@Component
public class MinApplicationInitial extends ApplicationInitializer{
    @Autowired
    UserEntityService userEntityService;
    @Autowired
    PlayPasswordService passwordService;
    @Override
    public void onRootContextRefreshed() {
        UserEntity userEntity =  userEntityService.getUserByName("admin");
        if(userEntity==null){
            userEntity = new UserEntity();
            userEntity.setName("admin");
            userEntity.setPassword(passwordService.encryptPassword("123456","salt"));
            userEntityService.save(userEntity);
        }


    }
}
