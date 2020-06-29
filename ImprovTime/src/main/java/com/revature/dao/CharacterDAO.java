package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Person;

public class CharacterDAO {
	List<Person> characterList;
	
	public CharacterDAO() {
		characterList=new ArrayList<Person>();
		
		Person c1=new Person(1,"Police Officer","An everyday police officer.");
		characterList.add(c1);
		
		Person c2=new Person(2,"Firefighter","A one-armed firefighter.");
		characterList.add(c2);
		
		Person c3=new Person(3,"Doctor","A doctor with a 95% fatality rate.");
		characterList.add(c3);
		
		Person c4=new Person(4,"Bartender","A bartender for a vegan bar.");
		characterList.add(c4);
		
		Person c5=new Person(5,"Programmer","A programmer that only knows how to work with JavaScript.");
		characterList.add(c5);
		
		Person c6=new Person(6,"Water Polo Player","A semi-proffessional water polo player.");
		characterList.add(c6);
		
		Person c7=new Person(7,"Nascar Driver","A nascar driver with a pet cougar.");
		characterList.add(c7);
		
		Person c8=new Person(8,"Waiter","A waiter who is allergic to most of the food he is serving.");
		characterList.add(c8);
		
		Person c9=new Person(9,"Drew Carey","As the host of 'Whose Line Is It Anyways?'.");
		characterList.add(c9);
		
		Person c10=new Person(10,"Teacher","That one cool teacher everyone had in high school.");
		characterList.add(c10);
	}
	
	public Person getCharacterById(int id) {
		Person p;
		if (id>characterList.size()) {
			 p=null;
		}else {
			p=characterList.get(id-1);
		}
		
		return p;
	}
	
	public List<Person> getCharacterList() {
		return characterList;
	}

	public void setCharacterList(List<Person> characterList) {
		this.characterList = characterList;
	}
	
	
}
