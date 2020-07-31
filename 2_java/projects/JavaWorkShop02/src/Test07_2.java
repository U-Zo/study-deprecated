import java.util.Scanner;

public class Test07_2 {

	public static void main(String[] args) {
		System.out.println("한 자리 정수 값을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = n;

		System.out.print(n + "(5)");
		for (int i = 2; n * i <= 100; i++) {
			sum += n * i;
			System.out.print("+" + (n * i));
		}

		System.out.println(" = " + sum);
		sc.close();
	}

}