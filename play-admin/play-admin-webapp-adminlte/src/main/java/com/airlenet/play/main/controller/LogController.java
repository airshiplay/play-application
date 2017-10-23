package com.airlenet.play.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.airlenet.play.main.service.LogEntityService;

@Controller
@RequestMapping("/center/log")
public class LogController {

    @Autowired
    private LogEntityService logEntityService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getUsrList() {
        return "classpath:/admin/log/list";
    }

    @RequestMapping(value = {"/view/{id}.view"}, method = RequestMethod.GET)
    public String view(Model model, @PathVariable Long id) {
        model.addAttribute("log", logEntityService.findOne(id));
        return "classpath:/admin/log/logView";
    }


}
