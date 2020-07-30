
public class IfElseTest {

	public static void main(String[] args) {
		int num = 2;
		String result = "홀수";
		
		if (num % 2 == 0) {
			result = "짝수";
			System.out.println(num + ": " + result);
		} else {
			System.out.println(num + ": " + result);
		}
	}

}
