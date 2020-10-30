package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;

public class DeptService {
	// DeptDAO dao = new DeptDAO();

	private DeptDAO dao; // new가 사라지고 .xml에서 주입
	private String driver;
	private String url;
	private String userid;
	private String pass;

	// setDriver, setUrl, setUserid, setPass 구현
	// jdbc.properties 파일에서 4가지 정보 가져와 property로 설정
	// main에서 service에 저장된 4가지 정보를 출력

	public DeptService() {

	}

	public DeptService(DeptDAO dao) {// xml에서 생성자를 주입받을 예정
		System.out.println("===== DeptService 생성차 호출 =====");
		this.dao = dao;
	}

	public List<String> list() {
		System.out.println("===== DeptService list() 호출 =====");
		return dao.list();
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "DeptService [driver=" + driver + ", url=" + url + ", userid=" + userid + ", pass=" + pass + "]";
	}

}
