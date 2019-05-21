package com.management_system.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.management_system.bean.Msg;
import com.management_system.bean.ReserveAgent;
import com.management_system.service.ReserveAgentService;
@Controller
public class ReserveAgentController {

	@Autowired
	ReserveAgentService reserveAgentService;
	
   @ResponseBody
   @RequestMapping("/reserveAgentAll")
   public Msg getReserveAgentAll(@RequestParam(value="pn",defaultValue="1")Integer pn,HttpSession session) {
	   Object user = session.getAttribute("Users");
	   if(user==null) {
		   return Msg.fail(user);
	   }else {
		   PageHelper.startPage(pn,12);
		   List<ReserveAgent> reserveAgents= reserveAgentService.getReserveAgentAll();
		   PageInfo<ReserveAgent> pageInfo= new PageInfo<ReserveAgent>(reserveAgents,6); 
		   System.err.println("===========>>"+session.getAttribute("Users"));
	       Object users = session.getAttribute("Users");
		   return Msg.success(users).add("reserveAgent", pageInfo);
	}
	  
   }
  
   @ResponseBody
   @RequestMapping(value="/getAgent/{id}",method=RequestMethod.GET)
   public Msg getAgent(@PathVariable("id")Integer id,HttpSession session) {
	   Object user = session.getAttribute("Users");
	   if(user==null) {
		   return Msg.fail(user);
	   }else {
	
	  ReserveAgent reserveAgent = reserveAgentService.getAgent(id);
	  Object users = session.getAttribute("Users");
	  return Msg.success(users).add("agent", reserveAgent);
	   }
   }	
   
   @ResponseBody
   @RequestMapping(value="/deleteAgent/{cId}",method=RequestMethod.POST)
   public Msg deleteAgentById(@PathVariable("cId")Integer cId ,HttpSession session) {
	   Object user = session.getAttribute("Users");
	   if(user==null) {
		   return Msg.fail(user);
	   }else {
	   reserveAgentService.deleteAgentById(cId);
	   Object users = session.getAttribute("Users");
	   return Msg.success(users);
	   }
   }
   
   
   
   
	
}
