package com.management_system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management_system.dao.ManagementUserMapper;
import com.management_system.service.ManagementUserService;
@Service
public class ManagementUserServiceImpl implements ManagementUserService {

	@Autowired
	ManagementUserMapper managementUserMapper;
	@Override
	public int insertManagementUser(String uName, Integer uAge, String uGender, String uNumber, String uUser,String uPassword) {
	   
		
		return managementUserMapper.insertManagementUser(uName, uAge, uGender, uNumber, uUser, uPassword);
	}

}
