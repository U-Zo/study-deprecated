package pet;

public class Cat extends Pet implements Movement {
	private String gender;

	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Cat [gender=" + gender + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

//	@Override
//	public void cry() {
//		System.out.println("Cat cry()");
//	}

	@Override
	public void eat() {
		System.out.println("Cat eat()");
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleep()");
	}
}
