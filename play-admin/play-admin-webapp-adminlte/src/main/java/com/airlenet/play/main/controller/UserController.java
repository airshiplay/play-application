package com.airlenet.play.main.controller;

import com.airlenet.play.main.entity.AdminUserEntity;
import com.airlenet.play.main.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.airlenet.security.PlayPasswordService;

@Controller
@RequestMapping("center/user")
public class UserController {

	@Autowired
	private PlayPasswordService passwordService;
	
	@Autowired
	private UserEntityService userEntityService;

	@RequestMapping(value="/list",method = RequestMethod.GET)
	public String getUsrList(){
		return "classpath:/admin/user/list";
	}
	@RequestMapping(value="/add",method = RequestMethod.GET)
	public String getUsrAdd(){
		return "classpath:/admin/user/userForm";
	}
	@RequestMapping(value="/edit/{userId}",method = RequestMethod.GET)
	public String getUsrEdit(@PathVariable Long userId,Model model){
		AdminUserEntity userEntity= userEntityService.findOne(userId);
		model.addAttribute("user", userEntity);
		return "classpath:/admin/user/userForm";
	}


}
