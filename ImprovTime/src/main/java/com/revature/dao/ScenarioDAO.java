package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Scenario;

public class ScenarioDAO {
	List<Scenario> scenarioList;
	
	public ScenarioDAO() {
		scenarioList=new ArrayList<Scenario>();
		
		Scenario s1=new Scenario(1, "Searching for someone", "Character 1 is searching for there long lost father.");
		scenarioList.add(s1);
		
		Scenario s2=new Scenario(2, "Rock, Paper, Scissors Match", "The two characters are having a heated rock, paper, scissors match.");
		scenarioList.add(s2);
		
		Scenario s3=new Scenario(3, "Proposal", "One of the characters is trying to propose to the other.");
		scenarioList.add(s3);
		
		Scenario s4=new Scenario(4, "Dinner Argument", "The two characters are arguing over what to have for dinner.");
		scenarioList.add(s4);
		
		Scenario s5=new Scenario(5, "Selfie", "The characters are attempting to get selfies to post on social media.");
		scenarioList.add(s5);
	}
	
	public Scenario getScenarioById(int id) {
		Scenario s;
		if (id>scenarioList.size()) {
			 s=null;
		}else {
			s=scenarioList.get(id-1);
		}
		
		return s;
	}

	public List<Scenario> getScenarioList() {
		return scenarioList;
	}

	public void setScenarioList(List<Scenario> scenarioList) {
		this.scenarioList = scenarioList;
	}
	
	
}
