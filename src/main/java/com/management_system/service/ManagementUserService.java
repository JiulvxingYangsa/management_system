package com.management_system.service;


public interface ManagementUserService {

	/**
	 * 添加管理员账户account
	 * @param uName
	 * @param uAge
	 * @param uGender
	 * @param uNumber
	 * @param uUser
	 * @param uPassword
	 * @return
	 */
	public int insertManagementUser(String uName,Integer uAge,String uGender,String uNumber,String uUser,String uPassword);
}
