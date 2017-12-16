package com.airlenet.play.vendor.activiti;

import org.activiti.engine.*;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author airlenet
 * @version 2017-12-13
 */

@Configuration
public class ActivitiConfigBean {

    @Value("${activiti.deploymentResources?:classpath*:/activiti/*.bpmn}")
    Resource[] resources;
    @Autowired
    ObjectFactory<DataSource> dataSource;

    @Bean
    SpringProcessEngineConfiguration processEngineConfiguration() {
        SpringProcessEngineConfiguration processEngineConfiguration = new SpringProcessEngineConfiguration();
        processEngineConfiguration.setDataSource(dataSource.getObject());
        processEngineConfiguration.setDatabaseSchemaUpdate("true");
        processEngineConfiguration.setAsyncExecutorActivate(false);
        processEngineConfiguration.setDeploymentResources(resources);
        processEngineConfiguration.setTransactionManager(transactionManager());
        return processEngineConfiguration;
    }

    @Bean
    PlatformTransactionManager transactionManager(){
        org.springframework.jdbc.datasource.DataSourceTransactionManager transactionManager =new org.springframework.jdbc.datasource.DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource.getObject());
        return transactionManager;
    }

    @Bean
    ProcessEngine processEngine() throws Exception {
        ProcessEngineFactoryBean processEngineFactoryBean = new ProcessEngineFactoryBean();
        processEngineFactoryBean.setProcessEngineConfiguration(processEngineConfiguration());
        return processEngineFactoryBean.getObject();
    }

    @Bean
    RepositoryService getRepositoryService() throws Exception {
        return processEngine().getRepositoryService();
    }

    @Bean
    RuntimeService getRuntimeService() throws Exception {
        return processEngine().getRuntimeService();
    }

    @Bean
    TaskService getTaskService() throws Exception {
        return processEngine().getTaskService();
    }

    @Bean
    HistoryService getHistoryService() throws Exception {
        return processEngine().getHistoryService();
    }

    @Bean
    ManagementService getManagementService() throws Exception {
        return processEngine().getManagementService();
    }

}
