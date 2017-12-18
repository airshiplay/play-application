package com.airlenet.website.controller;

import java.util.List;

import com.airlenet.play.cms.entity.AdEntity;
import com.airlenet.play.cms.service.AdEntityService;
import com.airlenet.play.main.service.SettingEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;


public class BaseController {
	@Autowired
	private AdEntityService adEntityService;
	@Autowired
	private SettingEntityService settingEntityService;


	@ModelAttribute
	public void golab(Model model) {
		List<AdEntity> carousel = adEntityService.findTop3("home-carousel", AdEntity.Type.image,AdEntity.Status.release);
		model.addAttribute("carouseList", carousel);
		model.addAllAttributes(settingEntityService.get());
	}
}
