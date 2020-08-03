package com.test;

public class Man {
	private String name;
	private int age;

	public Man(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person 생성자 2");
	}

	public Man(String name) {
		this(name, 19);
		System.out.println("Person 생성자 1");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Man m1 = new Man("홍길동");
		Man m2 = new Man("홍길동", 20);
	}
}
