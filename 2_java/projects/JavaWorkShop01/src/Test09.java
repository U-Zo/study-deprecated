import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("2. 정수를 입력하세요.");
		int num2 = sc.nextInt();
		
		System.out.println("정수 " + num1 + " 과 "
				+ "정수 " + num2 + " 중에서 최댓값: "
				+ (num1 > num2 ? num1 : num2));
	}

}
