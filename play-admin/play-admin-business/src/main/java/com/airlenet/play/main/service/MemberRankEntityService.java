package com.airlenet.play.main.service;

import com.airlenet.play.main.entity.MemberRankEntity;
import com.airlenet.play.main.repo.MemberRankEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberRankEntityService extends EntityService<MemberRankEntity, Long> {

    @Autowired
    private MemberRankEntityRepository memberRankEntityRepository;
}
