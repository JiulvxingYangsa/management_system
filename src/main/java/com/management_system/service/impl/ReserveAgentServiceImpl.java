package com.management_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management_system.bean.ReserveAgent;
import com.management_system.dao.ReserveAgentMapper;
import com.management_system.service.ReserveAgentService;
@Service
public class ReserveAgentServiceImpl implements ReserveAgentService {

	@Autowired
	ReserveAgentMapper reserveAgentMapper;
	
	@Override
	public List<ReserveAgent> getReserveAgentAll() {
	
		return reserveAgentMapper.selectReserveAgentAll();
	}

	@Override
	public ReserveAgent getAgent(Integer id) {
		
		return reserveAgentMapper.selectAentById(id);
	}

	@Override
	public int deleteAgentById(Integer id) {
		
		return reserveAgentMapper.deleteAgentById(id);
	}

}
