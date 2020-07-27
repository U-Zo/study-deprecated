
public class Sample02_variable5 {

	public static void main(String[] args) {
		int num_1 = 10;
		int num_2 = 20; // 변수명 중복
		int n = 10;
		float f = 20.3f;
		double d = n + f;
		int result = num_1 + num_2;
		
		short s = 10;
		short s2 = 20;
		short s3 = (short)(s + s2);
		
		System.out.println(num_1);
		System.out.println(num_2);
		System.out.println(result);
		System.out.println(d);
		System.out.println(s3);
	}

}
