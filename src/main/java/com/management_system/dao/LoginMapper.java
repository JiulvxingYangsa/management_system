package com.management_system.dao;

import org.apache.ibatis.annotations.Param;

import com.management_system.bean.ManagementUser;

public interface LoginMapper {

	public ManagementUser getByUser(@Param("uUser")String uUser,@Param("uPassword")String uPassword);
	
}
