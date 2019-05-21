package com.management_system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management_system.bean.ManagementUser;
import com.management_system.dao.LoginMapper;
import com.management_system.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginMapper loginMapper;
	
	@Override
	public ManagementUser getByUser(String uUser , String uPassword) {
		
		return loginMapper.getByUser(uUser,uPassword);
	}

}
