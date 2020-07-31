
public class ArrayCopyTest {
	
	public static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 10, 20, 30, 40, 50, 60 };
		
		printArr(arr1);
		printArr(arr2);
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length );
		printArr(arr1);
		printArr(arr2);
	}

}
