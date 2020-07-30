
public class WhileTest {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i <= 10) {
			sum += i++;
		}
		
		System.out.println(sum);
		
		i = 0;
		
		do {
			i +=2;
			System.out.println(i);
		} while (i <= 10);
	}

}
