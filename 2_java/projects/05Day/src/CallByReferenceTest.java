
public class CallByReferenceTest {

	public static void change(int[] arr) {
		System.out.println("배열 0번 값 변경 ===");
		arr[0] = 10;
	}
	
	public static void printArr(int[] arr) {
		System.out.print("배열의 값: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		
		printArr(arr);
		change(arr);
		printArr(arr);
	}

}
