package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.beans.Scenario;

import com.revature.dao.ScenarioDAO;

@Service
public class ScenarioService {
	ScenarioDAO sDAO;
	
	public ScenarioService() {
		sDAO=new ScenarioDAO();
	}
	
	public Scenario getScenarioById(int id) {
		Scenario s=sDAO.getScenarioById(id);
		return s;

	}
}
