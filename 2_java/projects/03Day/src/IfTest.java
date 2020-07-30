
public class IfTest {

	public static void main(String[] args) {
		// 단일 if문
		System.out.println("문장1");
		int num = 0;
		
		if (3 == 13) {
			num = 10;
			System.out.println("문장 2");
			System.out.println("문장 2-1");
		}
		
		System.out.println(num);
		System.out.println("문장3");
	}

}
