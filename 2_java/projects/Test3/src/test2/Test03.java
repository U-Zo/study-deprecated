package test2;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = (num / 100) * 100;
		System.out.println(result);
		sc.close();
	}
}
