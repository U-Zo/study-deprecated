
public class StuTest {
	// 멤버 변수, 객체 생성 시 자동 초기화, 객체 정보 저장
	String name;
	int age;
	
	// 멤버 메소드, 객체 생성 필요, 동작 관련
	public void printInfo() {
		int num = 1; // 로컬 변수
		System.out.println("printInfo() = " + num);
		System.out.println(name + ": " + age);
	}
	
	public static void main(String[] args) {
		StuTest st1 = new StuTest();
		st1.name = "홍길동";
		st1.age = 25;
		st1.printInfo();
		
		StuTest st2 = new StuTest();
		st2.name = "이순신";
		st2.age = 20;
		st2.printInfo();
	}
}
