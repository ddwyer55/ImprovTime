package com.revature.service;

import com.revature.beans.Person;
import com.revature.dao.CharacterDAO;

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
