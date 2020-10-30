package com.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

	private String name;
	private int age;

	public Student() {
		System.out.println("기본 생성자 호출");
	}

	// 어노테이션 적용
	@PostConstruct
	public void xxx() {
		System.out.println("초기화 메서드");
	}

	@PreDestroy
	public void yyy() {
		System.out.println("자원 반납 메서드");
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

}
