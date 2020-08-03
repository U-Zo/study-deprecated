
public class MaxSearch {
	private int max;

	public int maxSearch(int[] arr) {
		max = 0;

		for (int i : arr) {
			max = max < i ? i : max;
		}

		return max;
	}
}
