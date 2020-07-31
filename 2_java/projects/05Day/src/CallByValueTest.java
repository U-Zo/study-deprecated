
public class CallByValueTest {

	public void change(int num) {
		num = 100;
		System.out.println("change num = " + num);
	}

	public void changeArr(int[] num) {
		num[0] *= 10;
	}

	public void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int num = 1;
		System.out.println("호출 전 num = " + num);
		CallByValueTest test = new CallByValueTest();
		test.change(num);
		System.out.println("호출 후 num = " + num);

		int numArr[] = { 1, 2, 3, 4 };

		System.out.print("호출 전 numArr = ");
		test.printArr(numArr);
		
		test.changeArr(numArr);
		
		System.out.print("호출 후 numArr = ");
		test.printArr(numArr);

	}

}
