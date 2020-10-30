package com.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String name;
	private int age;
	
	@Autowired
	private Cat cat;

	public Student() {
	}

	public Student(Cat cat) {
		this.cat = cat;
	}

	// setter injection
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public String getInfo() {
		return name + "\t" + age + "\t" + cat;
	}
}
