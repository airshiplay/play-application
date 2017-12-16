package com.airlenet.play.vendor.activiti;

import com.airlenet.integration.webapp.RootConfigBean;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author airlenet
 * @version 2017-12-13
 */

//指定spring配置类
@ContextConfiguration(classes = {RootConfigBean.class})
//@WebAppConfiguration is a class-level annotation that is used to declare
//that the ApplicationContext loaded for an integration test should be a WebApplicationContext.
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class ActivitiTest {
    @Autowired
    ProcessEngine processEngine;
    @Test
    public void testA(){
       System.out.println( processEngine.getProcessEngineConfiguration().getDatabaseType());
    }
}
