package com.airlenet.play.main.controller;

import com.airlenet.play.main.entity.PlaySettingMap;
import com.airlenet.play.main.entity.SettingEntity;
import com.airlenet.play.main.service.SettingEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/center/setting")
public class SettingController {

    @Autowired
    private SettingEntityService settingEntityService;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String getList(Model model) {
        PlaySettingMap setting = settingEntityService.get();
        model.addAttribute("setting", setting);
        return "classpath:/admin/setting/info";
    }


}
