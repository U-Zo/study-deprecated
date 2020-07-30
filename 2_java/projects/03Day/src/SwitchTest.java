import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// switch
		System.out.println("점수를 입력하세요.");
		int num = 10;

		switch (num) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		case 40:
			System.out.println("40");
			break;
		default:
			System.out.println("default");
		}

		System.out.println("종료");

		char c = 'B';
		switch (c) {
		case 'A':
			System.out.println("A");
			break;
		case 'B':
			System.out.println("A2");
			break;
		case 'C':
			System.out.println("A3");
			break;
		case 'D':
			System.out.println("A4");
			break;
		default:
			System.out.println("default");
		}
		
		if (c == 'A') {
			System.out.println("A");
		} else if (c == 'B') {
			System.out.println("A2");
		} else if (c == 'C') {
			System.out.println("A3");
		} else if (c == 'D') {
			System.out.println("A4");
		} else {
			System.out.println("default");
		}

		System.out.println("문장3");
	}

}
