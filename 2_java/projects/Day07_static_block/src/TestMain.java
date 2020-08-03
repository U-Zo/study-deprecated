
public class TestMain {
	static { // 1
		System.out.println("static 초기화 블럭");
	}
	
	public TestMain() { // 3
		System.out.println("TestMain 생성자");
	}
	
	{ // 2
		System.out.println("인스턴스 초기화 블럭");
	}

	public static void main(String[] args) {
		TestMain m = new TestMain();
	}

}
