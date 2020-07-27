
public class Sample02_variable5_3 {
	String name;
	char c;
	int m;
	// 인스턴스 변수 or 멤버 변수
	// 생성 시점: 객체 생성 ~ 객체 소멸 (new 키워드 사용)
	// 메모리: 힙
	// 초기화 안 하면 자동으로 초기화
	static int k;
	// static 변수 (클래스 변수), new 없이 사용
	// 생성 시점: 프로그램 시작 ~ 종료
	// method area(클래스 정보, static, 상수, ...)
	// 초기화 안 하면 자동으로 초기화

	public static void main(String[] args) {
		// 로컬 변수(local variable): 메서드 안에서 선언
		// 생성 시점: 메서드 호출 ~ 메서드 종료
		// 메모리: 스택(stack)
		// 주의: 반드시 사용 전 초기화
		int n = 0;
		System.out.println(n); // 메인 로컬 변수 사용
		System.out.println(new Sample02_variable5_3().name);
		// 객체 생성 및 멤버 변수 사용
		System.out.println(k); // 클래스 변수 사용
	}

}
