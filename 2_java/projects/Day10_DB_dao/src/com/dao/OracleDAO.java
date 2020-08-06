package com.dao;

public class OracleDAO implements Dao {
	public void connect() {
		System.out.println("OracleDAO.connect()");
		// oracle db 접속하여 사용하는 메소드
	}
	
	@Override
	public void insert() {
		System.out.println("OracleDAO.insert()");
	}
}
