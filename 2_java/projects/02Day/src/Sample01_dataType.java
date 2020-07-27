import java.util.Date;

public class Sample01_dataType {

	public static void main(String[] args) {
		System.out.println("\uD64D"); // 문자열
		System.out.println("홍");
		System.out.println(100); // 정수
		System.out.println(3.14); // 실수, 3.14D 와 동일
		System.out.println(3.14F); // 실수, f 와 동일
		System.out.println(3.14D); // 실수, d 와 동일
		System.out.println(3.14F == 3.14D); // float, double 차이
		System.out.println('\uD64D'); // 문자
		System.out.println(true); // 논리값 true
		System.out.println(false); // 논리값 false
		// System.out.println(null);
		System.out.println(new Date());
	}

}
