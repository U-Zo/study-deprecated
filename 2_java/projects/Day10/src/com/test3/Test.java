package com.test3;

interface A {}

interface B {}

interface C extends A, B {} // 인터페이스가 다른 인터페이스를 상속 받을 수 있음

class My implements A, B {}

public class Test {

	public static void main(String[] args) {
		// A a = new A();
		// 인터페이스는 객체 생성할 수 없음
		
		A a2 = new My(); // 다형성
	}

}
