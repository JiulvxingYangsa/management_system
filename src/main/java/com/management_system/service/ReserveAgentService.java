package com.management_system.service;

import java.util.List;

import com.management_system.bean.ReserveAgent;

public interface ReserveAgentService {
    /**
     * 查询所有预加盟人员
     * @return
     */
	public List<ReserveAgent> getReserveAgentAll();
	
	/**
	 * 按id查询预加盟人员
	 * @param id
	 * @return
	 */
	public ReserveAgent getAgent(Integer id);
	/**
	 * 按id删除预加盟人员
	 * @param id
	 * @return
	 */
	public int deleteAgentById(Integer id);
}
