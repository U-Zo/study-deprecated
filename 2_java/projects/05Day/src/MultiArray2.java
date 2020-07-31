
public class MultiArray2 {

	public static void main(String[] args) {
		// 2차원 배열
		// 비정방형 (모든행의 열크기가 동일하지 않음)
		int[][] num = new int[2][]; // 2행
		
		num[0] = new int[3];
		num[1] = new int[2];
		
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		num[1][0] = 40;
		num[1][1] = 50;
		
		for (int[] i : num) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
