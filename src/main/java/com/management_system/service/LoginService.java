package com.management_system.service;

import com.management_system.bean.ManagementUser;

public interface LoginService {

	/**
	 * ��ѯ����Ա�˺�����
	 * @param uUser
	 * @param uPassword
	 * @return
	 */
	public ManagementUser getByUser(String uUser,String uPassword);
}
