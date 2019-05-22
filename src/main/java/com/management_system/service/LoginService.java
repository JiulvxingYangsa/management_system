package com.management_system.service;

import com.management_system.bean.ManagementUser;

public interface LoginService {

	/**
	 * 查询管理员账号密码
	 * @param uUser
	 * @param uPassword
	 * @return
	 */
	public ManagementUser getByUser(String uUser,String uPassword);
}
