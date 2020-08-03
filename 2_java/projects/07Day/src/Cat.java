
public class Cat extends Pet {
	// 동작
	public void cryCat() {
		System.out.println("야옹~");
	}

	public void eatCat() {
		System.out.println("생선 먹기");
	}

	public void sleepCat() {
		System.out.println("새근새근~");
	}

	public Cat(String name, int age, String gender) {
		super(name, age, gender);
		System.out.println("Cat 생성자 호출 ======");
	}
	
}
