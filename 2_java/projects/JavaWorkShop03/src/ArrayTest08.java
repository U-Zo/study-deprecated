
public class ArrayTest08 {

	public static void main(String[] args) {
		int[] score = { 99, 34, 67, 22, 11, 9 };

		int max = new MaxSearch().maxSearch(score);
		int min = new MinSearch().minSearch(score);

		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
