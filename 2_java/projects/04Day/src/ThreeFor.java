
public class ThreeFor {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}

		System.out.println("3의 배수의 합: " + sum);

		System.out.println();
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println();
		for (int i = 10; i > 0; i -= 2) {
			System.out.println(i);
		}
		
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(i + "\t" + j);
			}
		}
	}

}
