
public class MinSearch {
	private int min;

	public int minSearch(int[] arr) {
		min = 987654321;

		for (int i : arr) {
			min = min > i ? i : min;
		}

		return min;
	}
}
