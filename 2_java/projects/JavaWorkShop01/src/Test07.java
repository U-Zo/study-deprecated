import java.util.Scanner;


public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("2. 나이를 입력하세요.");
		int age = sc.nextInt();
		
		System.out.print("이름은 " + name
				+ ", 나이는 " + age + "입니다.");
		
		sc.close();
	}

}
