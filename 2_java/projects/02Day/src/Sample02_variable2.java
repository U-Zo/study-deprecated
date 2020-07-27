
public class Sample02_variable2 {

	public static void main(String[] args) {
		// 1. 변수 선언과 동시에 초기화
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		char gender = '남';
		boolean isMarried = false;
		float height = 185.63f;
		double weight = 78.25;
		long num = 2200000000l;
		
		System.out.println("이름: " + name + ", 나이: " + age
				+ ", 주소: " + address + ", 성별: " + gender
				+ ", 결혼: " + isMarried + ", 키: " + height
				+ ", 몸무게: " + weight);
		System.out.printf("이름: %s, 나이: %d, 주소: %s, "
				+ "성별: %c, 결혼: %b, 키: %.2f, 몸무게: %.2f\n",
				name, age, address, gender, isMarried, height, weight);
		System.out.println(num);
	}

}
