
public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arr = new CreateArray().arrCreate();

		PrintArr p = new PrintArr();
		Search s = new Search(arr, 10);
		System.out.println("sum = " + p.calcSum(arr));
		System.out.println("avg = " + p.getAvg());
		System.out.println(s.search());
	}

}
