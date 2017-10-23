package com.airlenet.play.plugin.oauth;

import com.airlenet.play.plugin.oauth.model.WeiboOauthPlugin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.airlenet.play.plugin.controller.PluginController;

@Controller
@RequestMapping("/oauth/weibo")
public class WeiboOauthController extends PluginController<WeiboOauthPlugin> {

}
