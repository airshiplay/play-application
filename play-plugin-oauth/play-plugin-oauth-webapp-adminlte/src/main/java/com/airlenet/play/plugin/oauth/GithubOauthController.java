package com.airlenet.play.plugin.oauth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.airlenet.play.plugin.controller.PluginController;
import com.airlenet.play.plugin.oauth.model.GithubOauthPlugin;

@Controller
@RequestMapping("/oauth/github")
public class GithubOauthController extends PluginController<GithubOauthPlugin> {

}
