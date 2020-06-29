package com.revature.beans;

public class Setting extends BaseBean {
	public Setting (int id, String name, String description) {
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
	}
}
