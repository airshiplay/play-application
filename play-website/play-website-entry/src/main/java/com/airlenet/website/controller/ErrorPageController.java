package com.airlenet.website.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorPageController extends BaseController {

    @RequestMapping(value = {"/notFound", "/404"})
    public String notFound(HttpServletRequest request) {
        if("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))){
            return null;
        }
        return "/404";
    }
}
