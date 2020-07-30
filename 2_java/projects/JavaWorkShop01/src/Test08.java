import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 정수를 입력하세요. : ");
		// String num = sc.next();
		int num = sc.nextInt();
		// int _num = Integer.parseInt(num);
		
		System.out.print("2. 정수를 입력하세요. : ");
		// String num2 = sc.next();
		int num2 = sc.nextInt();
		// int _num2 = Integer.parseInt(num2);
		
		System.out.println("정수 " + num + ", 정수 "
				+ num2 + "의 합계 : " + (num + num2));
	}

}