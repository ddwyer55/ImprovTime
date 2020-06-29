package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Setting;

public class SettingDAO {
	List<Setting> settingList;
	
	public SettingDAO() {
		settingList=new ArrayList<Setting>();
		
		Setting s1=new Setting(1,"Baseball Game","At a minor league baseball game.");
		settingList.add(s1);
		
		Setting s2=new Setting(2,"Wedding","At a relative's wedding.");
		settingList.add(s2);
		
		Setting s3=new Setting(3,"Funeral","At the funeral of character 1's father.");
		settingList.add(s3);
		
		Setting s4=new Setting(4,"Swamp","At a swamp full of alligators.");
		settingList.add(s4);
		
		Setting s5=new Setting(5,"Mountain Peak","At the peak of Mount Everest.");
		settingList.add(s5);
	}
	
	public Setting getSettingById(int id) {
		Setting s;
		if (id>settingList.size()) {
			 s=null;
		}else {
			s=settingList.get(id-1);
		}
		
		return s;
	}

	public List<Setting> getSettingList() {
		return settingList;
	}

	public void setSettingList(List<Setting> settingList) {
		this.settingList = settingList;
	}
	
	
}
