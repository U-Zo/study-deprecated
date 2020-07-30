import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력하세요.");
		String addr = sc.nextLine();
		System.out.println("문자 갯수(공백 포함): " + addr.length());
		System.out.println("단어 갯수: " + addr.split(" ").length);
	}

}
