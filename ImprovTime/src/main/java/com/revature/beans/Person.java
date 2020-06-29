package com.revature.beans;

public class Person extends BaseBean{
	public Person(int id,String name, String description) {
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
	}
}
