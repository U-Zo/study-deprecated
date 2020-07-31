
public class ArrayTest {

	public static void main(String[] args) {
		// 배열 선언
		// 데이터 타입[] 변수명;
		int[] num;
		
		int sum = 0;

		// 배열 생성
		// 변수명 = new 데이터타입[크기]
		num = new int[5];
		// 4바이트씩 3개의 공간 할당
		// num은 배열 주소로 참조

		// 배열 초기화
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 100;
		num[4] = 80;

		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println("배열 크기(길이): " + num.length);
		for (int i = 0; i < num.length; i++) {
			// System.out.println(">> " + num[i]);
			sum += num[i];
		}
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + sum / num.length);
		
		int sum2 = 0;
		// for each 문
		for (int x : num) {
			System.out.println(x);
			sum2 += x;
		}
		
		System.out.println("총합: " + sum2);
		System.out.println("평균: " + sum2 / num.length);
	}

}
