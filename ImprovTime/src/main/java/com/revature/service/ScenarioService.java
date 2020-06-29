package com.revature.service;

import com.revature.beans.Scenario;

import com.revature.dao.ScenarioDAO;


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
