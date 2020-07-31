
public class Search {
	private int[] arr;
	private int num;
	
	public Search(int[] arr, int num) {
		this.arr = arr;
		this.num = num;
	}
	
	public String search() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i + "번 배열에 있습니다.";
			}
		}

		return "해당 숫자가 없습니다.";
	}
	
//	public String searchIndex(int[] arr, int num) { 
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == num) {
//				return i + "번에 있습니다.";
//			}
//		}
//		
//		return "해당 숫자가 없습니다.";
//	}
}
