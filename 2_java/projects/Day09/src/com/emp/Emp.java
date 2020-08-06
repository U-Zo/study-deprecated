package com.emp;

public class Emp {
	private String name;
	
	@Override
	public String toString() {
		return "Emp [name=" + name + "]";
	}

	public Emp() {
		super(); // 부모의 기본생성자 호출
	}

	public Emp(String name) {
		this.name = name;
	}

	// getter,setter 생략
	public String printInfo() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
