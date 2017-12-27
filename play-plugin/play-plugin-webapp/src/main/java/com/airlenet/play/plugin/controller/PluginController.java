package com.airlenet.play.plugin.controller;

import com.airlenet.plugin.core.Plugin;
import com.airlenet.plugin.core.config.PluginConfigEntity;
import com.airlenet.plugin.core.config.PluginConfigService;
import com.airlenet.repo.domain.Result;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;


public class PluginController<T extends Plugin> {

    @Autowired
    private PluginConfigService pluginConfigService;

    @Autowired
    private T plugin;

    /**
     * 安装
     */
    //@RequiresRoles(value = "admin")
    @RequestMapping(value = "/install", method = RequestMethod.POST)
    public
    @ResponseBody
    Result install() {
        if (!plugin.getIsInstalled()) {
            PluginConfigEntity pluginConfig = new PluginConfigEntity();
            pluginConfig.setPluginId(plugin.getId());
            pluginConfig.setDisabled(true);
            pluginConfigService.save(pluginConfig);
        }
        return Result.success();
    }

    /**
     * 卸载
     */
    //@RequiresRoles(value = "admin")
    @RequestMapping(value = "/uninstall", method = RequestMethod.POST)
    public
    @ResponseBody
    Result uninstall() {
        if (plugin.getIsInstalled()) {
            PluginConfigEntity pluginConfig = plugin.getPluginConfig();
            pluginConfigService.delete(pluginConfig);
        }
        return Result.success();
    }

    /**
     * 设置
     */
    //@RequiresRoles(value = "admin")
    @RequestMapping(value = "/setting", method = RequestMethod.POST)
    public
    @ResponseBody
    Result setting(@ModelAttribute("pluginConfig") @Valid PluginConfigEntity pluginConfig, BindingResult result, Model model) {
        preUpdate(pluginConfig, result, model);

        if (result.hasErrors()) {
            return Result.validateError();
        }

        pluginConfigService.save(pluginConfig);

        nextUpdate(pluginConfig);
        return Result.success();
    }

    protected void preUpdate(PluginConfigEntity pluginConfig, BindingResult result, Model model) {

    }
    protected void nextUpdate(PluginConfigEntity pluginConfig) {

    }
    public PluginConfigService getPluginConfigService() {
        return pluginConfigService;
    }

    public T getPlugin() {
        return plugin;
    }

}
