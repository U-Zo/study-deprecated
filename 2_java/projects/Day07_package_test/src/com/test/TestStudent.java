package com.test; // 항상 첫 번째는 패키지, 그 다음 import

import com.cat.Cat;
import com.yyy.Student;

public class TestStudent {

	public static void main(String[] args) {
		// com.yyy.Student test = new com.yyy.Student();
		Student test = new Student();
		System.out.println(test.name);

		Cat cat = new Cat();
	}

}
