
public class MemberTest { // class 블럭
	// 멤버, 인스턴스 변수 - class 블럭에 선언
	// 선언 후 초기화 불필요, 객체 생성 시 자동 초기화
	
	static int num = 10; // 객체 생성 없이 사용 가능
	
	String name = "박아무개";
	String phoneNumber;
	String address;
	char gender;
	
	// 멤버 메소드
	public void printInfo() {
		System.out.println(name + " " + phoneNumber + " " + address);
	}

	public static void main(String[] args) { // main 블럭
		// 로컬 변수(메서드에 선언된 변수), 선언과 초기화를 해야 함
		int num = 10;
		System.out.println("로컬 변수 " + num);
		System.out.println(MemberTest.num);
		System.out.println(new MemberTest().name);
		
		MemberTest m1 = new MemberTest(); // 객체 생성
		m1.name = "홍길동"; // 객체 접근, name 멤버 변수 저장
		
		MemberTest m2 = new MemberTest();
		m2.name = "이순신";
		
		MemberTest m3 = new MemberTest();
		m3.name = "강감찬";
		m3.address = "서울";
		
//		System.out.println(m1.name); // 생성 객체 멤버 변수 참조
//		System.out.println(m2.name);
//		System.out.println(m3.name + " " + m3.address);
		
		m1.printInfo();
		m2.printInfo();
		m3.printInfo();
	} // main 블럭

} // class 블럭
