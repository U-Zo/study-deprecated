
public class Dog extends Pet {
	private String color; // 다른 애완동물에 없는 속성 가정...

	// 동작
	public void cryDog() {
		System.out.println("멍멍~");
	}

	public void eatDog() {
		System.out.println("사료 먹기");
	}

	public void sleepDog() {
		System.out.println("쿨쿨~");
	}

	// 다른 애완동물에 없는 기능 가정...
	public void runDog() {
		System.out.println("발발~");
	}

	public Dog(String name, int age, String gender, String color) {
		super(name, age, gender);
		this.color = color;
		System.out.println("Dog 생성자 호출 ======");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
