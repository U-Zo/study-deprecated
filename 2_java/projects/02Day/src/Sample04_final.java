
public class Sample04_final {

	public static void main(String[] args) {
		// 상수: 값 변경 불가
		// Byte.MIN_VALUE, Byte.MAX_VALUE
		final int SIZE = 100;
		//SIZE = 200; // 오류 발생, 값 변경 불가
		System.out.println(SIZE);
		int num = 10;
		System.out.println(num);
		num = 20;
		System.out.println(num);
		System.out.println(num * SIZE);
	}

}
