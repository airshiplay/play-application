package com.airlenet.play.plugin.payment.model;

import com.airlenet.play.main.entity.AdminUserEntity;
import com.airlenet.repo.jpa.DataEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author airlenet
 * @version 2017-12-19
 */
@Entity
@Table(name = "play_order")
public class OrderEntity extends DataEntity<AdminUserEntity,Long>{


}
