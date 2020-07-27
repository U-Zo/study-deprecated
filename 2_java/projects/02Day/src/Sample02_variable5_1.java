
public class Sample02_variable5_1 {

	public static void main(String[] args) {
		// 자바는 블럭 scope (자바 스크립트는 함수 scope)
		int test = 100;
		{// A블럭
			int num = 10;
			System.out.println(num);
			System.out.println(test);
		}
		
		// System.out.println(num); // 블럭 밖에서는 인식 불가
		{// B블럭
			int num = 20;
			System.out.println(num);
			System.out.println(test);
		}
	} // main 블럭

}
