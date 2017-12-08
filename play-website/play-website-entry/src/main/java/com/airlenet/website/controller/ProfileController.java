package com.airlenet.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author airlenet
 * @version 2017-12-08
 */
@Controller
public class ProfileController extends BaseController{
    @RequestMapping("/profile")
    public String profile() {
        return "/profile";
    }

}
