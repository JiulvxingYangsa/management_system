package com.management_system.dao;

import java.util.List;

import com.management_system.bean.ReserveAgent;

public interface ReserveAgentMapper {

	public List<ReserveAgent> selectReserveAgentAll();
	
	public ReserveAgent selectAentById(Integer cId);
	
	public int deleteAgentById(Integer cId);
	
}
