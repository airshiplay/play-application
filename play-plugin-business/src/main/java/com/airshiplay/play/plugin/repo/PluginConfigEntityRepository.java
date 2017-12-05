package com.airshiplay.play.plugin.repo;

import com.airshiplay.play.plugin.entity.PluginConfigEntity;
import com.airlenet.repo.jpa.EntityRepository;

public interface PluginConfigEntityRepository extends EntityRepository<PluginConfigEntity, Long> {

    Long countByPluginId(String pluginId);

    PluginConfigEntity findFirstByPluginId(String pluginId);

    void deleteByPluginId(String pluginId);

}
