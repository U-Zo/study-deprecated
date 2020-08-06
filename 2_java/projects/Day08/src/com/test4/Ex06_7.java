package com.test4;

class Employee {
	String name;
	int salary;

	public String getEmployee() {
		return name + " " + salary;
	}
	
	public Employee() {};
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}

class Manager extends Employee {
	String depart;
	
	@Override
	public String getEmployee() {
		return super.getEmployee() + " " + depart;
	}
	
	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
}

public class Ex06_7 {

	public static void main(String[] args) {
		Employee e = new Employee("홍길동", 2000);
		System.out.println(e.getEmployee());
		
		e = new Manager("이순신", 4000, "개발");
		System.out.println(e.getEmployee());
	}

}
