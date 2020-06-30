package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.beans.Person;
import com.revature.dao.CharacterDAO;

@Service
public class CharacterService {
	CharacterDAO cDAO;
	
	public CharacterService() {
		cDAO=new CharacterDAO();
	}
	
	public Person getCharacterById(int id) {
		Person p=cDAO.getCharacterById(id);
		return p;
	}
}
