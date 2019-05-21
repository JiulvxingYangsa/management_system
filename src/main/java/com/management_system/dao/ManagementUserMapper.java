package com.management_system.dao;

import org.apache.ibatis.annotations.Param;

import com.management_system.bean.ManagementUser;

public interface ManagementUserMapper {
       
	public int insertManagementUser(@Param("uName")String uName,@Param("uAge")Integer uAge,@Param("uGender")String uGender,@Param("uNumber")String uNumber,@Param("uUser")String uUser,@Param("uPassword")String uPassword);
	
	
	
}
