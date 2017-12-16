package com.airlenet.play.main.controller;

import com.airlenet.play.main.entity.AdminUserEntity;
import com.airlenet.play.main.entity.LanguageEntity;
import com.airlenet.play.main.service.LanguageEntityService;
import com.airlenet.play.main.service.UserEntityService;
import com.airlenet.security.PlayPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import org.springframework.security.crypto.password.PasswordEncoder;

@Controller
@RequestMapping("center/language")
public class LanguageController {


    @Autowired
    private LanguageEntityService languageEntityService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getUsrList() {
        return "classpath:/admin/language/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getUsrAdd() {
        return "classpath:/admin/language/languageForm";
    }

    @RequestMapping(value = "/edit/{userId}", method = RequestMethod.GET)
    public String getUsrEdit(@PathVariable Long userId, Model model) {
        LanguageEntity languageEntity = languageEntityService.findOne(userId);
        model.addAttribute("language", languageEntity);
        return "classpath:/admin/language/languageForm";
    }


}
