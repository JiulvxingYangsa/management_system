package com.management_system.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.management_system.bean.ManagementUser;
import com.management_system.bean.Msg;
import com.management_system.service.LoginService;
@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	@ResponseBody
	@RequestMapping("/verifyLogin")
	public void verifyLogin(@RequestParam("uUser")String uUser,@RequestParam("uPassword")String uPassword ,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
	   ManagementUser managementUser = loginService.getByUser(uUser,uPassword);
		System.out.println("用户："+managementUser);
		
	   if(managementUser!=null) {
		   HttpSession session = request.getSession();
		   session.setAttribute("Users",managementUser.getuUser());
		   System.out.println("输出一下session："+session.getAttribute("Users"));
		   response.sendRedirect(request.getContextPath()+"/index.html");
	   }else {
		   response.sendRedirect(request.getContextPath()+"/loginFail2.html");
	}
	
  }

	@RequestMapping("/eixtLogin")
	@ResponseBody
    public Msg eixtLogin(HttpSession session) {
		Object user = session.getAttribute("Users");
	   if(user==null) {
		   return Msg.fail();
	   }else {
	       session.removeAttribute("Users");     
	       return Msg.success();
	   }
	   
	   }
	
	
	
	
	
	
}