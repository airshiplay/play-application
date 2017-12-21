package com.airlenet.play.reactor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.Environment;
import reactor.bus.EventBus;

import static reactor.bus.selector.Selectors.$;

/**
 * @author airlenet
 * @version 2017-12-21
 */
@Configuration
public class EventConfig {

    @Bean
    Environment environment() {
        return Environment.initializeIfEmpty().assignErrorJournal();
    }

    @Bean
    public EventBus eventBus(Environment environment) {
        EventBus eventBus = EventBus.create(environment, Environment.THREAD_POOL);
        return eventBus;
    }
}