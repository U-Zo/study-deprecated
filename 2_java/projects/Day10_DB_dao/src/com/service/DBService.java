package com.service;

import com.dao.Dao;

public class DBService {
	private static DBService db;
	private Dao dao;
	
	private DBService() {};
	
	public static DBService getDBService() {
		if (db == null) {
			db = new DBService();
		}
		
		return db;
	}
	
	public void setDAO(Dao dao) {
		this.dao = dao;
		dao.connect(); // 실제 실행할 dao 클래스의 db 접속 함수 호출
	}
	
	public void insert() {
		dao.insert();
	}
}
