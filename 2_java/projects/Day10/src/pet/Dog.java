package pet;

public class Dog extends Pet implements Movement {
	private String color;

	// 기능==> 이전에 오버라이딩

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void cry() {
		System.out.println("dog cry()");
	}

	@Override
	public void eat() {
		System.out.println("dog eat()");
	}

	@Override
	public void sleep() {
		System.out.println("dog sleep()");
	}
}
