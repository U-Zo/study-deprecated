package com.test;

public class Bank {
	private static Bank b = new Bank(); // static 변수로 하여 프로그램 실행 시 Bank 객체 하나 생성

	private Bank() {} // 생성자를 private으로 제한하여 외부에서 객체 생성 차단

	public static Bank getBank() {
		return b; // 생성한 static 변수의 객체를 리턴
	}

	public String getName() {
		return "xx은행";
	}
}
