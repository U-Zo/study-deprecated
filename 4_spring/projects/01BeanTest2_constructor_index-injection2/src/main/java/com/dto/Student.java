package com.dto;

import java.util.Map;

public class Student {

	private String name;
	private int age;
	private Map<String, Cat> catMap; // has a 표현

	// setter injection
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map<String, Cat> getCatMap() {
		return catMap;
	}

	// setter injection
	public void setCatMap(Map<String, Cat> catMap) {
		this.catMap = catMap;
	}

	public String getInfo() {
		return name + "\t" + age;
	}
}
