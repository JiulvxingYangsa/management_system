package com.management_system.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.management_system.service.ManagementUserService;

@Controller
public class ManagementUserController {
 
	
	@Autowired
	ManagementUserService managementUserService;
	@RequestMapping("/addManagementUser")
	public void addManagementUser(@RequestParam("uName")String uName, @RequestParam("uAge")Integer uAge, @RequestParam("uGender")String uGender, @RequestParam("uNumber")String uNumber, @RequestParam("uUser")String uUser,@RequestParam("uPassword")String uPassword ,HttpServletResponse response,HttpServletRequest request) throws IOException {
		
		
		managementUserService.insertManagementUser(uName, uAge, uGender, uNumber, uUser, uPassword);
		
		response.sendRedirect(request.getContextPath()+"/success.html");
		
		try {
			Thread.sleep(2000);
			response.sendRedirect(request.getContextPath()+"/reserve_franchisee.html");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
