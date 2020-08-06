package com.pet2;

public class TestPet {
	public void petArrPrint(Pet[] pArr) {
		for (Pet pet : pArr) {
			petPrint(pet);
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
	
	public Pet[] createPetArr() {
		Pet[] pl = {
				new Cat("야옹이", 1, "암놈"),
				new Dog("댕댕이", 2, "숫놈", "하양"),
				new Fish("뻐끔이", 1, "암놈", 1.0)
		};
		
		return pl;
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
		Pet[] pl = tp.createPetArr();
		tp.petArrPrint(pl);
	}
}
