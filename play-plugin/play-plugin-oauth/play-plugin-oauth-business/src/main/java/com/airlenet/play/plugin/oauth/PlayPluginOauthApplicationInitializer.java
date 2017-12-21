package com.airlenet.play.plugin.oauth;

import com.airlenet.integration.core.ApplicationInitializer;
import com.airlenet.play.main.config.PlayAdminConfig;
import com.airlenet.play.main.util.AdminEventKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.bus.Event;
import reactor.bus.EventBus;
import reactor.bus.selector.Selectors;

/**
 * @author airlenet
 * @version 2017-12-21
 */
@Component
public class PlayPluginOauthApplicationInitializer extends ApplicationInitializer {

    @Override
    public void onRootContextRefreshed() {

    }
}
