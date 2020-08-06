package pet;

public interface Movement {
	public default void cry() {
		System.out.println("default cry()");
	};

	public abstract void eat();

	public abstract void sleep();
}
