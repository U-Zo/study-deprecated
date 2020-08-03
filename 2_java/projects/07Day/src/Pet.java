
public class Pet {
	private String name;
	private int age;
	private String gender;
	
	public Pet() {
		System.out.println("Pet 기본 생성자 호출 ======");
	}
	
	public Pet(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("Pet 생성자 호출 ========");
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
