package com.airlenet.play.main;

import com.alibaba.druid.support.http.WebStatFilter;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author airlenet
 * @version 2018-01-12
 */
@Order(2)
public class PlayWebApplicationInitializer implements WebApplicationInitializer {
    private static final String SERVLET_NAME="DruidStatView";
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        com.alibaba.druid.support.http.StatViewServlet servletContainer = servletContext.createServlet(com.alibaba.druid.support.http.StatViewServlet.class);
        ServletRegistration.Dynamic dynamic = servletContext.addServlet(SERVLET_NAME, servletContainer);
        dynamic.setLoadOnStartup(2);
        dynamic.addMapping("/druid/*");
        WebStatFilter webStatFilter = servletContext.createFilter(WebStatFilter.class);
        FilterRegistration.Dynamic druidWebStatFilter = servletContext.addFilter("DruidWebStatFilter", webStatFilter);
        druidWebStatFilter.setInitParameter("exclusions","/assets/*,*.js,*.gif,*.jpg,*.png,*.css,*.ico,*.ttf,/druid/*");
        druidWebStatFilter.setInitParameter("principalSessionName", DefaultSubjectContext.PRINCIPALS_SESSION_KEY);
        druidWebStatFilter.setInitParameter("profileEnable","true");
        druidWebStatFilter.addMappingForUrlPatterns(null,true,"/*");
    }
}
