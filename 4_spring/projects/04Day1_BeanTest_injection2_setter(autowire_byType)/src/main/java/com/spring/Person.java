package com.spring;

public class Person {
	private String username;
	Cat cat;

	public Person() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Cat getCata() {
		return cat;
	}

	public void setCat(Cat cat) { // set함수의 매개변수 이름과 같은 id를 가진 객체를 주입 받음
		this.cat = cat;
	}

	public Person(String x) {
		System.out.println("Person 생성자" + x);
	}

	public Person(String x, String y) {
		System.out.println("Person 생성자" + x + "\t" + y);
	}

	public Person(String xx, int yy) {
		System.out.println("Person 생성자" + xx + "\t" + yy);
	}

	public String getInfo() {
		return "이순신" + cat;
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", cat=" + cat + "]";
	}

}