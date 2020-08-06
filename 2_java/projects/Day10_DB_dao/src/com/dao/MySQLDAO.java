package com.dao;

public class MySQLDAO implements Dao {
	@Override
	public void connect() {
		System.out.println("MySQLDAO.connect()");
		// mysql db 접속하여 사용하는 메소드
	}

	@Override
	public void insert() {
		System.out.println("MySQLDAO.insert()");
	}
}
