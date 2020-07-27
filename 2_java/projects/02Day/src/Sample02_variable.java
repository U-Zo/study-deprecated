
public class Sample02_variable {

	public static void main(String[] args) {
		// 1. 변수 선언 (메모리에 특정 크기 영역 생성)
		String name; // 변수, name 변수, 문자열 변수, String 타입
		int age; // 정수형 변수, int 타입
		String address; // 문자열 변수, String 타입
		char gender; // 문자형 변수, char 타입
		boolean isMarried; // 기본형 변수
		float height; // 기본형 변수
		double weight; // 기본형 변수
		
		// 2. 변수 초기화 (값 할당)
		name = "홍길동";
		age = 20;
		address = "서울";
		gender = '남';
		isMarried = false;
		height = 185.63f; // 주의
		weight = 78.25;
		
		System.out.println("String name = " + name);
		System.out.println("int age = " + age);
		System.out.println("String address = " + address);
		System.out.println("char gender = " + gender);
		System.out.println("boolean = " + isMarried);
		System.out.println("float height = " + height);
		System.out.println("double weight = " + weight);
	}

}
