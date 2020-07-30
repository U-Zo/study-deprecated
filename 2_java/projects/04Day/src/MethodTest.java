
public class MethodTest {

	public void aMethod(String name) { // 아무 곳에서 접근, 반환값 x, 함수 이름, 받는 값 없음
		System.out.println("aMethod() 호출1");
		System.out.println("aMethod() 호출2");
		System.out.println("aMethod() 전달 받은 인자: " + name);
	} // class 선언, 멤버 메소드 new 사용 생성, 사용

	public void bMethod() {
		System.out.println("bMethod() 호출1");
		System.out.println("bMethod() 호출2");
	}

	public static void main(String[] args) {
		// 프로그램 시작
		System.out.println("main 시작 =========");
		MethodTest test = new MethodTest();
		test.aMethod("홍길동");
		test.bMethod();
		System.out.println("main 종료 =========");
		// 프로그램 종료
	}

}
