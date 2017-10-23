package com.airlenet.play.wechat.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.airlenet.repo.jpa.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * 关注用户 时间
 *
 * @author lig
 */
@Entity
@Table(name = "wechat_attention_subscribe")
@Getter
@Setter
public class AttentionUserSubscribeEntity extends BaseEntity<Long> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "attention_uid")
    private AttentionUserEntity attentionUser;

    @Temporal(TemporalType.TIMESTAMP)
    private Date subscribeTime;

    /**
     * 1关注，2取消关注
     */
    @Column
    private int status;
}
