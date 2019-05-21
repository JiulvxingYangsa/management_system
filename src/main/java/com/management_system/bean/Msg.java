package com.management_system.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 *
 * @author Administrator
 *
 */
public class Msg {
   
	//处理码
	private int code;
    //消息提醒
	private String msg;

	private String users;

	//封装成一个Map

	private Map<String, Object> extend  = new HashMap<String, Object>();
	
	
	
	public static Msg success() {
		  Msg result = new Msg();
	         result.setCode(100);
	         result.setMsg("处理成功");
	         return result;
		
	}
	
	public static Msg success(Object users) {
         Msg result = new Msg();
         result.setCode(100);

         result.setUsers(users);

         result.setMsg("处理成功");

         return result;
	}
	
	public static Msg fail() {
		Msg result = new Msg();
		result.setCode(200);
		result.setMsg("处理失败");
		return result;
	}
	public static Msg fail(Object users) {
        Msg result = new Msg();
        result.setCode(100);
        result.setMsg("处理成功");
        result.setUsers(users);
        return result;
	}
	
	public Msg add(String key, Object value) {
		this.getExtend().put(key, value);
		return this;
		
	}
	
	
	
	
	public String getUsers() {
		return users;
	}

	public void setUsers(Object users2) {
		this.users = (String) users2;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getExtend() {
		return extend;
	}
	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
   
   
   
}
