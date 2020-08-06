package com.test;

class Super {
	public int num1 = 10;
	protected int num2 = 20;
	int num3 = 30;
	private int num4 = 40;
	
	public int getNum4() {
		return num4;
	}
}

class Sub extends Super {
	private int num5 = 50;
	
	public void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(getNum4());
		System.out.println(num5);
	}
}

public class Ex06_4 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.print();
	}

}
