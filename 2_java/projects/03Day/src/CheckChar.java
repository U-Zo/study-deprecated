import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		char c = sc.next().charAt(0);
		
		if (c >= 'a' && c <= 'z') {
			System.out.println("소문자");
		} else if (c >= 'A' && c <= 'Z') {
			System.out.println("대문자");
		} else {
			System.out.println("영문자가 아닙니다.");
		}
		
		sc.close();
	}

}
