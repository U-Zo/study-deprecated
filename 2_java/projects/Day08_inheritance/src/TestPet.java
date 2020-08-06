
public class TestPet {

	public static void main(String[] args) {
		Pet c = new Cat("야옹이", 3, "암놈");
		System.out.println(c.printInfo());
		Pet d = new Dog("강아지", 10, "암놈", "검정");
		System.out.println(d.printInfo());
		Pet f = new Fish("붕어", 3, "숫놈", 10);
		System.out.println(f.printInfo());
		
		// 고양이 2마리,강아지 1마리 ,물고기 1마리 객체 선언
		// Cat c = new Cat("야옹이", 3, "암놈");
		// Dog d = new Dog("댕댕이", 2, "숫놈", "하얀색");
		// Fish f = new Fish("뻐끔이", 1, "미상", 150.9);

		// Pet 배열 선언, 자식 객체들로 배열 초기화
		// Pet[] pArr = { c, d, f };

		// pArr의 모든 요소를 순서대로 Pet 객체 타입의 pet 변수에 저장
		// pArr의 크기만큼 각 객체의 printInfo() 메소드 수행
		// Cat, Dog, Fish 객체는 Overriding 에 의해 각 객체의 printInfo() 메소드 수행
		// 단, Overridden 메소드가 아니면 접근할 수 없음
		// for (Pet p : pArr) {
		// System.out.println(p.printInfo());
		// }

		// Pet 타입의 변수 p 에 새로운 객체 Cat 을 가리키게 하고
		// 변수 p를 통해 Cat 객체의 Overridden 메소드가 아닌 다른 메소드는 접근할 수 없음
		// Pet p = new Cat("야옹이3", 3, "숫놈");
		// p.getGender(); -> 접근 불가 오류
		// 새로운 Cat 타입의 변수 cat 을 만들어 p 의 형태를 Cat 객체 타입으로 변형시켜 가리키게 하면
		// cat 변수를 통해 Cat 객체의 멤버들에 접근할 수 있음
		// Cat cat = (Cat) p;
	}

}
