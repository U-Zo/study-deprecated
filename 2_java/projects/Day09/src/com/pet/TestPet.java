package com.pet;

import java.util.Scanner;

public class TestPet {
	public void petArrPrint(Pet[] pArr) {
		for (Pet pet : pArr) {
			if (pet instanceof Cat) {
				Cat c = (Cat) pet;
				System.out.println(c.printInfo());
				System.out.println(c.getGender());
				System.out.println("종류: 고양이");
			} else if (pet instanceof Dog) {
				Dog d = (Dog) pet;
				System.out.println(d.printInfo());
				System.out.println(d.getColor());
				System.out.println("종류: 강아지");
			} else if (pet instanceof Fish) {
				Fish f = (Fish) pet;
				System.out.println(f.printInfo());
				System.out.println(f.getTailSize());
				System.out.println("종류: 물고기");
			} else {
				System.out.println(pet.printInfo());
				System.out.println("종류: 애완동물");
			}
		}
	}

	public void petPrint(Pet p) {
		if (p instanceof Cat) {
			System.out.println("Cat: " + ((Cat) p).getGender());
		} else if (p instanceof Dog) {
			System.out.println("Dog: " + ((Dog) p).getColor());
		} else if (p instanceof Fish) {
			System.out.println("Fish: " + ((Fish) p).getTailSize());
		}
	}
	
	public Pet createPet(int num) {
		Pet p = null;
		
		switch (num) {
		case 1:
			p = new Cat("야옹이", 1, "암놈");
			break;
		case 2:
			p = new Dog("댕댕이", 2, "숫놈", "하양");
			break;
		case 3:
			p = new Fish("뻐끔이", 1, "암놈", 1.0);
			break;
		}
		
		return p;
	}

	public static void main(String[] args) {
		TestPet tp = new TestPet();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. (1: Cat, 2: Dog, 3: Fish): ");
		int n = sc.nextInt();
		
		while (n < 1 || n > 3) {
			System.out.println("잘못된 숫자를 입력하였습니다.");
			System.out.print("숫자를 입력하세요. (1: Cat, 2: Dog, 3: Fish): ");
			n = sc.nextInt();
		}
		
		Pet p = tp.createPet(n);
		tp.petPrint(p);
		
		sc.close();
		

//		Pet c = new Cat("야옹이", 3, "암놈");
//		Pet d = new Dog("강아지", 10, "암놈", "검정");
//		Pet f = new Fish("븡어", 10, "암놈", 2.5);
//
//		Pet[] pArr = { c, d, f };

		// System.out.println(c.printInfo());
		// tp.petPrint(c);
		// tp.petPrint(d);
		// tp.petPrint(f);

		// tp.petArrPrint(pArr);
	}
}
