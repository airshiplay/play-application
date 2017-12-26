package com.airlenet.play.main.service;

import com.airlenet.play.main.entity.RoleEntity;
import com.airlenet.play.main.repo.RoleEntityRepository;
import com.airlenet.repo.domain.Tree;
import com.airlenet.repo.domain.TreeHelper;
import com.airlenet.repo.domain.TreeImpl;
import com.airlenet.repo.jpa.HierarchicalEntityService;
import com.airlenet.play.main.entity.MenuEntity;
import com.airlenet.play.main.entity.QRoleEntity;
import com.airlenet.play.main.repo.MenuEntityRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class MenuEntityService extends HierarchicalEntityService<MenuEntity, Long> {

    @Autowired
    private MenuEntityRepository menuEntityRepository;

    @Autowired
    private RoleEntityRepository roleEntityRepository;

    @Transactional(readOnly = true,value = "transactionManager")
    public MenuEntity findByCode(String code) {
        return menuEntityRepository.findByCode(code);
    }

    @Transactional(readOnly = true,value = "transactionManager")
    public Tree<MenuEntity> getAllMenuTree() {
        Tree<MenuEntity> tree = findTree(null);
        return tree;
    }

    @Transactional(readOnly = true,value = "transactionManager")
    public Tree<MenuEntity> getMenuTreeByUserId(Long userId) {
        RoleEntity roleEntity = roleEntityRepository.findOne(QRoleEntity.roleEntity.users.any().id.eq(userId));
        if(roleEntity==null){
            return TreeHelper.toTree(null, new ArrayList<MenuEntity>());
        }
        if ("superadmin".equals(roleEntity.getCode())) {
            return findTree(null);
        }
        Tree<MenuEntity> tree = TreeHelper.toTree(null, Lists.newArrayList(roleEntity.getMenus()));
        return tree;
    }
}
