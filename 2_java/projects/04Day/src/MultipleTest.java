
public class MultipleTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j += 2) {
				System.out.print(j + " x " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}
	}

}