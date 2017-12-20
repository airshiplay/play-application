package com.airlenet.play.plugin.payment;

import com.airlenet.play.plugin.controller.PluginController;
import com.airlenet.play.plugin.payment.model.AlipayPlugin;
import com.airlenet.play.plugin.payment.service.AlipayPluginService;
import com.airlenet.plugin.core.config.PluginConfigEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author airlenet
 * @version 2017-12-19
 */
@Controller
@RequestMapping("/payment/alipay")
public class AlipayPluginController extends PluginController<AlipayPlugin> {

    @Autowired
    AlipayPluginService alipayPluginService;

    @Override
    protected void preUpdate(PluginConfigEntity pluginConfig, BindingResult result, Model model) {
        pluginConfig.getAttribute(AlipayPlugin.APP_ID_ATTRIBUTE_NAME);
    }

    @Override
    protected void nextUpdate(PluginConfigEntity pluginConfig) {
        alipayPluginService.updateAlipayClient();
    }
}
