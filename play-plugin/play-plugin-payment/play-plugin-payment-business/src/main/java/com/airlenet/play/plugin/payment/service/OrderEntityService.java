package com.airlenet.play.plugin.payment.service;

import com.airlenet.play.plugin.payment.model.OrderEntity;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.stereotype.Service;

/**
 * @author airlenet
 * @version 2017-12-20
 */
@Service
public class OrderEntityService extends EntityService<OrderEntity,Long> {
}
