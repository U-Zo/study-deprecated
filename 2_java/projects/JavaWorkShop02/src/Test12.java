import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("양의 정수값의 자리수 구하기");
		int n = -1;
		while (n < 0) {
			System.out.print("정수값: ");
			n = sc.nextInt();
		}

		int cnt = 1;
		while (n > 9) {
			n /= 10;
			cnt++;
		}
		
		System.out.println("그 수는 " + cnt + "자리입니다.");
		sc.close();
	}

}
