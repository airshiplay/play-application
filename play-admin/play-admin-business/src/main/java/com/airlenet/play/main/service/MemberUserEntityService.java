package com.airlenet.play.main.service;

import com.airlenet.play.main.entity.QMemberUserEntity;
import com.airlenet.play.main.repo.MemberUserEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import com.airlenet.play.main.entity.MemberUserEntity;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberUserEntityService extends EntityService<MemberUserEntity, Long> {

    @Autowired
    private MemberUserEntityRepository memberUserEntityRepository;

    @Transactional(readOnly = true,value = "transactionManager")
    public MemberUserEntity findByUsername(String username) {
        return memberUserEntityRepository.findByUsername(username);
    }

    @Transactional(readOnly = true,value = "transactionManager")
    public MemberUserEntity findByEmail(String email) {
        return memberUserEntityRepository.findByEmail(email);
    }

    @Transactional(readOnly = true,value = "transactionManager")
    public MemberUserEntity findByMobile(String mobile) {
        return memberUserEntityRepository.findByMobile(mobile);
    }

    public Page<MemberUserEntity> findByRankId(Long rankId, Predicate predicate, Pageable pageable) {
        return memberUserEntityRepository.findAll(QMemberUserEntity.memberUserEntity.rank.id.eq(rankId).and(predicate), pageable);
    }
}
