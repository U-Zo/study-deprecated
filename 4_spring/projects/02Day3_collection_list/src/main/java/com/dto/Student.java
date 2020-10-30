package com.dto;

import java.util.List;

public class Student {

	private String name;
	private int age;
	private List<Cat> listCat; // has a 표현

	// setter injection
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Cat> getListCat() {
		return listCat;
	}

	// setter injection
	public void setListCat(List<Cat> listCat) {
		this.listCat = listCat;
	}

	public String getInfo() {
		return name + "\t" + age;
	}
}
