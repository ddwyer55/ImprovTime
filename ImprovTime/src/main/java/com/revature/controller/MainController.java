package com.revature.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Person;
import com.revature.beans.Scenario;
import com.revature.beans.Setting;
import com.revature.beans.Suggestion;
import com.revature.service.CharacterService;
import com.revature.service.ScenarioService;
import com.revature.service.SettingService;


@RestController

@RequestMapping(path="/")
public class MainController {
	private SettingService setServ;
	private ScenarioService scenServ;
	private CharacterService cServ;
	private Logger log;
	
	@Autowired
	public MainController(SettingService set, ScenarioService sce, CharacterService c) {
		setServ=set;
		scenServ=sce;
		cServ=c;
		log=Logger.getLogger(MainController.class);
	}
	
	@GetMapping
	public ResponseEntity<Suggestion> getSuggestion() {

		
		Person c1=cServ.getCharacterById(randomNum(10));
		Person c2;
		do {
			 c2=cServ.getCharacterById(randomNum(10));
		}while(c2.getId()==c1.getId());
		
		Setting setting=setServ.getSettingById(randomNum(5));
		Scenario scenario=scenServ.getScenarioById(randomNum(5));
		
		Suggestion s=new Suggestion(c1,c2,setting,scenario);
		log.trace(s);
		return ResponseEntity.ok(s);
	}
	
	public int randomNum(int input) {
		int random=(int)(Math.random()*input+1);
		log.trace("random number: "+random);
		return random;
		}
}
