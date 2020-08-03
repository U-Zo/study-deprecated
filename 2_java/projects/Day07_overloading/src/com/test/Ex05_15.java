package com.test;

public class Ex05_15 {
	public Ex05_15() {System.out.println("() 생성자 호출");}
	public Ex05_15(String a) {System.out.println("(String a) 생성자 호출");}
	public Ex05_15(int a) {System.out.println("(int a) 생성자 호출");}
	public void sum() {System.out.println("() 함수 호출");}
	public void sum(int a) {System.out.println("(int a) 함수 호출");}
	public void sum(String a) {System.out.println("(String a) 함수 호출");}
	public void sum(int num, String str) {System.out.println("(int String) 함수 호출");}
	public void sum(String str, int num) {System.out.println("(String int) 함수 호출");}
	
	public static void main(String[] args) {
		Ex05_15 test1 = new Ex05_15();
		Ex05_15 test2 = new Ex05_15("홍길동");
		
		test1.sum();
		test1.sum("홍길동");
		test1.sum(10, "ㅁㄴㅇ");
		test1.sum("asd", 10);
	}	

}
