
public class Sample03_typeCasting {

	public static void main(String[] args) {
		// 데이터 타입 변경(묵시적 형변환)
		// 1. 수치형 데이터
		byte b = 10;
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		float b5 = b4;
		double b6 = b5;

		double n1 = 10;
		float n2 = (float) n1;
		long n3 = (long) n2;
		int n4 = (int) n3;
		short n5 = (short) n4;
		byte n6 = (byte) n5;

		// 2. char -> int
		char c = 'A'; // ASCII 65
		int c2 = c + 1;
		System.out.println(c2);

		// 3. int보다 작은 타입의 연산 결과는 int로

		short x = 10;
		short x2 = 20;
		int x3 = x + x2;

		// 4. 문자열과 문자열이 아닌 데이터 -> 연결된 문자열
		System.out.println("10" + 1 + 2 + 3); // 10123
		System.out.println(1 + 2 + 3 + "10"); // 610
		
		// "10" -> 10
		// 자바스크립트: Number.parseInt("10");
		// 자바: Integer.parseInt("10");

		String k = "10";
		System.out.println(k + 20); // 1020
		int k2 = Integer.parseInt(k);
		System.out.println(k2 + 20); // 30
		
		// 10 -> "10"
		// 자바 스크립트: toString();
		// 자바: String.valueOf(10);
		// 자바: String.valueOf(3.14);
		// 자바: String.valueOf(true);
		System.out.println(String.valueOf(10) + 10); // 1010
		
		// 5. 작은 타입과 큰 타입 연산 -> 큰 타입
		int p = 100;
		double p2 = 3.14;
		double p3 = p + p2;
		System.out.println(p3);
	}

}
