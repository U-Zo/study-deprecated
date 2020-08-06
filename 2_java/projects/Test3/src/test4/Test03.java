package test4;

import java.util.Scanner;

public class Test03 {
	public static int getMax(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int n = sc.nextInt();
		int maxHeight = 0;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("사람 " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
			maxHeight = getMax(maxHeight, arr[i]);
		}
		
		System.out.println("최댓값은 " + maxHeight + "입니다.");
	}
}
