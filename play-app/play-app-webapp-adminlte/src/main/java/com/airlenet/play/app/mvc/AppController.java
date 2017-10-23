package com.airlenet.play.app.mvc;

import com.airlenet.play.app.service.AppEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app/app")
public class AppController {

    @Autowired
    AppEntityService appService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getList() {
        return "classpath:/app/app/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAdd() {
        return "classpath:/app/app/add";
    }

    @RequestMapping(value = "/addstore", method = RequestMethod.GET)
    public String getAddstore() {
        return "classpath:/app/app/addstore";
    }

    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public String getView(@PathVariable Long id, Model model) {
        model.addAttribute("app", appService.findOne(id));
        return "classpath:/app/app/view";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String getEdit(@PathVariable Long id, Model model) {
        model.addAttribute("app", appService.findOne(id));
        return "classpath:/app/app/edit";
    }

    @RequestMapping(value = "/dialog/storeAppList", method = RequestMethod.GET)
    public String getDialogStoreAppList() {
        return "classpath:/app/app/dialog/storeAppList";
    }

}
