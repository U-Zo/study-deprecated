package com.emp;

public class Eng extends Emp {
	private String skill;

	@Override
	public String toString() {
		return "Eng [name=" + super.getName() + " skill=" + skill + "]";
	}

	public Eng() {
		super();
	}

	public Eng(String name, String skill) {
		super(name);
		this.skill = skill;
	}

	@Override
	public String printInfo() {
		return super.printInfo() + "\t" + skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
}
