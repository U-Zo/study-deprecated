
public class ForTest {

	public static void main(String[] args) {
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " 홀수");
				oddSum += i;
			} else {
				System.out.println(i + " 짝수");
				evenSum += i;
			}
		}
		
		System.out.println("홀수 합: " + oddSum);
		System.out.println("짝수 합: " + evenSum);
	}

}
