package com.dto;

public class Woman {

	private String name;
	private int age;
	private String email;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Woman [name=" + name + ", age=" + age + ", email=" + email + "]";
	}

}
