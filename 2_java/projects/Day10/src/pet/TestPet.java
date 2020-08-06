package pet;

public class TestPet {
	public static void main(String[] args) {
		Pet p = new Cat("야옹이", 10, "암컷");
		
		// p.cry();
		// 오류, Pet 클래스에는 cry() 메소드가 정의되어있지 않음

		Movement m = (Cat) p;
		m.cry();
		// Movement 인터페이스 변수로도
		// 해당 인터페이스를 사용하는 객체를 가리킬 수 있음

		Cat c = (Cat) p;
		c.cry();
		// Cat 클래스에서 사용하는 인터페이스 Movement에 정의된 메소드는
		// Cat 객체에서도 호출할 수 있음
		
		Movement[] ml = new Movement[] {
				c,
				new Dog("댕댕이", 1, "검정")
		};
	}
}
