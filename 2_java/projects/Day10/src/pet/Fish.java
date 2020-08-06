package pet;

public class Fish extends Pet implements Movement {
	private double tailSize; // Fish에만 존재하는 속성 가정

	// 동작
	public void swimFish() {
		System.out.println("어푸어푸~");
	}

	public Fish() {
		super();
	}

	public Fish(String name, int age, double tailSize) {
		super(name, age);
		this.tailSize = tailSize;
	}

	public double getTailSize() {
		return tailSize;
	}

	public void setTailSize(double tailSize) {
		this.tailSize = tailSize;
	}

	@Override
	public void cry() {
		System.out.println("fish cry()");
	}

	@Override
	public void eat() {
		System.out.println("fish eat()");
	}

	@Override
	public void sleep() {
		System.out.println("fish sleep()");
	}
}
