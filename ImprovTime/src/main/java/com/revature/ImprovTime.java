package com.revature;



import org.apache.log4j.Logger;

import com.revature.beans.Person;
import com.revature.beans.Scenario;
import com.revature.beans.Setting;
import com.revature.service.CharacterService;
import com.revature.service.ScenarioService;
import com.revature.service.SettingService;

public class ImprovTime {
	static Logger log=Logger.getLogger(ImprovTime.class);
	
	
	public static void main(String[] args) {
		
		
		
		SettingService setServ=new SettingService();
		ScenarioService scenServ=new ScenarioService();
		CharacterService cServ=new CharacterService();
		
		Person c1=cServ.getCharacterById(randomNum(10));
		Person c2;
		do {
			 c2=cServ.getCharacterById(randomNum(10));
		}while(c2.getId()==c1.getId());
		
		Setting setting=setServ.getSettingById(randomNum(5));
		Scenario scenario=scenServ.getScenarioById(randomNum(5));
		
		System.out.println("Characters:\n"+c1.info()+"\n"+c2.info());
		System.out.println("\nSetting:\n"+setting.info());
		System.out.println("\nScenario:\n"+scenario.info());
	}
	
	
	
	
	public static int randomNum(int input) {
		int random=(int)(Math.random()*input+1);
		log.trace("random number: "+random);
		return random;
	}
}
