package com.airlenet.play.min.entity;

import com.airlenet.repo.jpa.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author airlenet
 * @version 2017-11-04
 */
@Entity
@Table(name = "min_user")
public class UserEntity extends BaseEntity<Long>{
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
