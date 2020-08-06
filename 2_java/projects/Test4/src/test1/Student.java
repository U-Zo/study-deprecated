package test1;

public class Student {
	private String name;
	private int age;
	private int height;
	private int weight;

	public Student(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age="
				+ age + ", height=" + height
				+ ", weight=" + weight + "]";
	}

	public int getAge() {
		return age;
	}
}
