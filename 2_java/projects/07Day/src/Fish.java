
public class Fish extends Pet {
	private double tailSize; // Fish에만 존재하는 속성 가정

	// 동작
	public void swimFish() { // Fish에만 존재하는 메소드
		System.out.println("어푸어푸~");
	}

	public Fish(String name, int age, String gender, double tailSize) {
		super(name, age, gender);
		this.tailSize = tailSize;
		System.out.println("Fish 생성자 호출 ======");
	}

	public double getTailSize() {
		return tailSize;
	}

	public void setTailSize(double tailSize) {
		this.tailSize = tailSize;
	}

}
