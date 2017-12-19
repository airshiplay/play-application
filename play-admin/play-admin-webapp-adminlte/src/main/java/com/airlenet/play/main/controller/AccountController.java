package com.airlenet.play.main.controller;

//import org.apache.commons.lang3.StringUtils;

import com.airlenet.core.SpringContext;
import com.airlenet.play.main.entity.AdminUserEntity;
import com.airlenet.play.main.service.UserEntityService;
import com.airlenet.plugin.core.Plugin;
import com.airlenet.plugin.core.PluginService;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.BeanUtilsBean2;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import OauthPlugin;
//import OauthUserEntity;
//import OauthPluginService;
//import OauthUserService;
import com.airlenet.security.CustomUserDetails;
import com.airlenet.security.PlayPasswordService;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author airlenet
 * @version 2017-09-12
 */
@Controller
@RequestMapping("/center/account")
public class AccountController {

    @Autowired
    private UserEntityService userEntityService;

    //	@Autowired
//	OauthUserService oauthUserService;
//	@Autowired
//	OauthPluginService oauthPluginService;
    @Autowired
    private PluginService pluginService;
    @Autowired
    private PlayPasswordService passwordService;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String get(Model model) {
        Subject subject = SecurityUtils.getSubject();
        @SuppressWarnings("unchecked")
        AdminUserEntity user = ((CustomUserDetails<Long, AdminUserEntity>) subject.getPrincipal()).getCustomUser();
        model.addAttribute("user", user);

        try {
            Class<Plugin> oauthPluginCls = (Class<Plugin>) Class.forName("com.airlenet.play.plugin.oauth.model.OauthPlugin");
            List<Plugin> oauthPlugins = pluginService.getEnabledPlugins(oauthPluginCls);
            model.addAttribute("oauthPlugins", oauthPlugins);

            Object oauthUserService = SpringContext.getBean("oauthUserService");
            List<Object> oauthUsers = (List<Object>) MethodUtils.invokeMethod(oauthUserService, true, "findByAdminUserId", user.getId());
            List<String> oauthUserPluginIds = new ArrayList<String>();
            oauthPlugins.forEach(new Consumer<Plugin>() {
                @Override
                public void accept(Plugin t) {
                    oauthUsers.forEach(new Consumer<Object>() {

                        @Override
                        public void accept(Object u) {
                            try {
                                Object oauthPluginId = MethodUtils.invokeMethod(u, true, "getOauthPluginId");
                                if (t.getId().equals(oauthPluginId)) {
                                    oauthUserPluginIds.add(t.getId());
                                }
                            } catch (NoSuchMethodException e) {
                                // ignore
                            } catch (IllegalAccessException e) {
                                // ignore
                            } catch (InvocationTargetException e) {
                                // ignore
                            }
                        }
                    });
                }
            });
            model.addAttribute("oauthUsers", oauthUsers);
            model.addAttribute("oauthUserPluginIds", oauthUserPluginIds);
        } catch (ClassNotFoundException e) {
            // ignore
        } catch (NoSuchMethodException e) {
            // ignore
        } catch (IllegalAccessException e) {
            // ignore
        } catch (InvocationTargetException e) {
            // ignore
        }

        return "classpath:/admin/account/info";
    }

    @RequestMapping(value = "/password", method = RequestMethod.GET)
    public String getPassword(Model model) {
        return "classpath:/admin/account/password";
    }


}
