package com.airlenet.play.plugin.oauth;

import com.airlenet.play.plugin.oauth.model.WeChatMpOauthPlugin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.airlenet.play.plugin.controller.PluginController;

@Controller
@RequestMapping("/oauth/wechatmp")
public class WeChatMpOauthController extends PluginController<WeChatMpOauthPlugin> {

}
