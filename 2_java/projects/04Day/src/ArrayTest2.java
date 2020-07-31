
public class ArrayTest2 {

	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;

		num = new int[4];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		
		for (int x : num) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
