package com.revature.beans;

public class Suggestion {
	private Person character1;
	private Person character2;
	private Setting setting;
	private Scenario scenario;
	
	public Suggestion(Person c1, Person c2, Setting set,Scenario sce) {
		character1=c1;
		character2=c2;
		setting=set;
		scenario=sce;
	}



	public Person getCharacter1() {
		return character1;
	}



	public void setCharacter1(Person character1) {
		this.character1 = character1;
	}



	public Person getCharacter2() {
		return character2;
	}



	public void setCharacter2(Person character2) {
		this.character2 = character2;
	}



	public Setting getSetting() {
		return setting;
	}



	public void setSetting(Setting setting) {
		this.setting = setting;
	}



	public Scenario getScenario() {
		return scenario;
	}



	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}



	@Override
	public String toString() {
		return "Suggestion [character1=" + character1 + ", character2=" + character2 + ", scenario=" + scenario
				+ ", setting=" + setting + "]";
	}
	
	
}
