package com.airlenet.play.main.controller;

import com.airlenet.play.main.service.OrganizationEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/center/org")
public class OrganizationController {
	@Autowired
	private OrganizationEntityService organizationEntityService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String get(Model model) {
		return "classpath:/admin/org/list";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return "classpath:/admin/org/orgForm";
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String edit(Model model,@PathVariable Long id) {
		model.addAttribute("org", organizationEntityService.findOne(id));
		return "classpath:/admin/org/orgForm";
	}

}
