
public class TestMain {
	// 가변 인자, 멤버 메소드
	public void a(int... is) {
		for (int i : is) {
			System.out.print(i + " ");
		}

		System.out.println();
	}

	public void b(String... strings) {
		for (String i : strings) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}

	public static void c() {
		System.out.println("static 메소드");
	}

	public static void main(String[] args) {
		TestMain m = new TestMain();
		m.a(10);
		m.a(10, 20);
		m.a(10, 20, 30);
		m.a(10, 20, 30, 4, 5, 6, 7, 8);

		m.b("이순신", "홍길동");
		c();
	}

}
