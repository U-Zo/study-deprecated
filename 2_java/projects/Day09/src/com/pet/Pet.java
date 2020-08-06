package com.pet;

public class Pet {
	String name;
	int age;

	public Pet() { // Pet pet= new Pet();
		super();
	}

	// 생성자를 작성해 놓으면 5~7라인의 기본생성자를 넣어 주지 않음
	// 이경우 new Pet(), super() 기본생성자가 없으므로 객체 생성이 안되고
	// 에러가 남
	// 즉 생성자를 따로 작성시 new Pet(), super()를 대비 하여 기본생성자를 적어주어야함
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public String printInfo() {
		System.out.println("pet printInfo()호출==============");
		return name + "\t" + age;
	}
}
