package com.airlenet.play.main.rest;

import com.airlenet.play.main.entity.AdminUserEntity;
import com.airlenet.play.main.entity.MenuEntity;
import com.airlenet.play.main.service.MenuEntityService;
import com.airlenet.play.main.service.RoleEntityService;
import com.airlenet.repo.domain.Result;
import com.airlenet.repo.domain.Tree;
import com.querydsl.core.types.Predicate;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author airlenet
 * @version 2017-09-12
 */
@RestController
@RequestMapping("/center/menu")
public class MenuRestController {


    @Autowired
    private MenuEntityService menuEntityService;

    @Autowired
    private RoleEntityService roleEntityService;

    @RequiresUser
    //@RequiresPermissions("data:sys:menu:read")
    @RequestMapping(value = "/tree", method = RequestMethod.GET)
    @ResponseBody
    public Tree<MenuEntity> tree(Predicate predicate) {
        Tree<MenuEntity> tree = menuEntityService.findTree(predicate);
        tree.setIconClsProperty("iconCls");
        tree.setTextProperty("text");
        tree.makeExpandAll();
        return tree;
    }

    @RequiresUser
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    @ResponseBody
    public Page<MenuEntity> page(Predicate predicate, Pageable pageable) {
        return menuEntityService.findAll(predicate, pageable);
    }

    @RequiresUser
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Result doSave(@ModelAttribute @Valid MenuEntity menu, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return Result.validateError();
        }
        menuEntityService.save(menu);
        return Result.success();
    }
}
