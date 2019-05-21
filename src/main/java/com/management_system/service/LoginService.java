package com.management_system.service;

import com.management_system.bean.ManagementUser;

public interface LoginService {

	public ManagementUser getByUser(String uUser,String uPassword);
}
