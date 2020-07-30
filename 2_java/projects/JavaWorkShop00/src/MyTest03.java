
public class MyTest03 {

	public static void main(String[] args) {
		int n = 10;
		int n2 = 20;
		int tmp = 0;
		
		// tmp = n;
		// n = n2;
		// n2 = tmp;
		
		tmp = n2;
		n2 = n;
		n = tmp;
		
		System.out.println("n 값은 " + n);
		System.out.println("n2 값은 " + n2);
	}

}
