package com.management_system.service;

import java.util.List;

import com.management_system.bean.ReserveAgent;

public interface ReserveAgentService {
    /**
     * ��ѯ����Ԥ������Ա
     * @return
     */
	public List<ReserveAgent> getReserveAgentAll();
	
	/**
	 * ��id��ѯԤ������Ա
	 * @param id
	 * @return
	 */
	public ReserveAgent getAgent(Integer id);
	/**
	 * ��idɾ��Ԥ������Ա
	 * @param id
	 * @return
	 */
	public int deleteAgentById(Integer id);
}
