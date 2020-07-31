
public class MultiArray {

	public static void main(String[] args) {
		// 2차원 배열
		// 정방형 (모든행의 열크기 동일)
		
		// 배열 선언
		int[][] num;
		
		// 배열 생성
		num = new int[2][3];
		
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		num[1][0] = 40;
		num[1][1] = 50;
		num[1][2] = 60;
		
		// System.out.println(num.length);
		// System.out.println(num[0].length);
		
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int[] i : num) {
			for (int j : i) {
				System.out.print(j + " ");
				sum += j;
			}
			System.out.println();
		}
		
		avg = sum / (num.length * num[0].length);
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
	}

}
