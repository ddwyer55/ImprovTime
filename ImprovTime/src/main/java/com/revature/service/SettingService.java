package com.revature.service;


import org.springframework.stereotype.Service;

import com.revature.beans.Setting;

import com.revature.dao.SettingDAO;
@Service
public class SettingService {
	SettingDAO sDAO;
	
	public SettingService() {
		sDAO=new SettingDAO();
	}
	
	public Setting getSettingById(int id) {
		Setting s=sDAO.getSettingById(id);
		return s;
	
	}
}
