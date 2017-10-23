package com.airlenet.play.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.airlenet.play.main.service.AreaEntityService;

@Controller
@RequestMapping("/center/area")
public class AreaController {

	@Autowired
	private AreaEntityService areaEntityService;
	
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public String getUsrList(){
		return "classpath:/admin/area/list";
	}

}
