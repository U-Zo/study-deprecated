import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		// 다중 if ~ else
		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char result;
		if (num >= 90) {
			result = 'A';
		} else if (num >= 80) {
			result = 'B';
		} else if (num >= 70) {
			result = 'C';
		} else {
			result = 'F';
		}
		
		System.out.println(result);
		sc.close();
	}

}
