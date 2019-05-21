package com.management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.management_system.bean.Msg;
import com.management_system.service.ManagementUserService;

@Controller
public class ManagementUserController {
 
	
	@Autowired
	ManagementUserService managementUserService;
	@RequestMapping("/addManagementUser")
	public String addManagementUser(@RequestParam("uName")String uName, @RequestParam("uAge")Integer uAge, @RequestParam("uGender")String uGender, @RequestParam("uNumber")String uNumber, @RequestParam("uUser")String uUser,@RequestParam("uPassword")String uPassword) {
		
		
		managementUserService.insertManagementUser(uName, uAge, uGender, uNumber, uUser, uPassword);
		return "success";
		
	}
	
	
}
