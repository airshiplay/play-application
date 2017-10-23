package com.airlenet.play.main.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.airlenet.play.main.entity.MenuEntity;
import com.airlenet.play.main.service.MenuEntityService;
import com.airlenet.repo.domain.Tree;

@Controller
@RequestMapping("/center/menu")
public class MenuController {

    @Autowired
    private MenuEntityService menuEntityService;


    @RequiresPermissions("page:sys:menu:read")
    @RequestMapping(value = "/list.view", method = RequestMethod.GET)
    public String get(Model model) {
        Tree<MenuEntity> tree = menuEntityService.findTree(null);
        tree.setIconClsProperty("iconCls");
        tree.setTextProperty("text");
        model.addAttribute("allMenuTree", tree.getRoots());
        return "classpath:/admin/menu/list";
    }

    @RequestMapping(value = "/add.view", method = RequestMethod.GET)
    public String getMenuAdd(Model model) {
        return "classpath:/admin/menu/add";
    }

    @RequestMapping(value = "/edit/{id}.view", method = RequestMethod.GET)
    public String getMenuEdit(Model model, @PathVariable Long id) {
        return "classpath:/admin/menu/edit";
    }

    @RequestMapping(value = "/dialog/tree.view", method = RequestMethod.GET)
    public String getMenuTree(Model model) {
        return "classpath:/admin/menu/dialog/tree";
    }


}
