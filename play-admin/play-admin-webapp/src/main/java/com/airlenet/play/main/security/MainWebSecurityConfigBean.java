package com.airlenet.play.main.security;

import com.airlenet.security.FilterChainDefinition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.util.*;

@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class MainWebSecurityConfigBean {
    @Value("${path.admin?:/admin}")
    private  String adminPath;

    @Bean("admin")
    public AdminUserFilter getAdminUserFilter(){
        AdminUserFilter adminUserFilter = new AdminUserFilter();
        adminUserFilter.setLoginUrl(adminPath.startsWith("/")||adminPath.equals("")?adminPath+"/login":"/"+adminPath+"/login");
        return adminUserFilter;
    }

    @Bean
    public List<FilterChainDefinition> getFilterChainDefinitionList(){
        List<FilterChainDefinition> list=  new ArrayList<>();
        list.add(new FilterChainDefinition(adminPath.startsWith("/")||adminPath.equals("")?adminPath+"/login":("/"+adminPath+"/login"), "anon"));
        list.add(new FilterChainDefinition(adminPath.startsWith("/")?adminPath:"/"+adminPath,"admin"));
        list.add(new FilterChainDefinition(adminPath.startsWith("/")?adminPath+"/**":"/"+adminPath+"/**", "admin"));
        list.add(new FilterChainDefinition("/**/**.view", "admin"));
        return list;
    }
}
