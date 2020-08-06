package com.emp;

public class Man extends Emp {
	private String depart; // 관리부서

	@Override
	public String toString() {
		return "Man [name=" + super.getName() + " depart=" + depart + "]";
	}

	public Man() {
		super();
	}

	public Man(String name, String depart) {
		super(name);
		this.depart = depart;
	}

	@Override
	public String printInfo() {
		return super.printInfo() + "\t" + depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
}
