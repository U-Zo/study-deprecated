
public class TestStudent {
	public static void main(String[] args) {
		// 클래스명 변수명 = new 클래스명();
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		stu1.setName("홍길동");
		stu1.setAge(20);
		stu1.setAddress("서울");
		
		stu2.setName("이순신");
		stu2.setAge(44);
		stu2.setAddress("전라");
		
		stu3.setName("유관순");
		stu3.setAge(19);
		stu3.setAddress("경기");

//		stu1.name = "홍길동";
//		stu1.age = 20;
//		stu1.address = "서울";
//
//		stu2.name = "이순신";
//		stu2.age = 44;
//		stu2.address = "전라";
//
//		stu3.name = "유관순";
//		stu3.age = 19;
//		stu3.address = "경기";

		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());
		System.out.println(stu1.getAddress());
		System.out.println(stu1.stuInfo());
		
		System.out.println(stu2.getName());
		System.out.println(stu2.getAge());
		System.out.println(stu2.getAddress());
		
		System.out.println(stu3.getName());
		System.out.println(stu3.getAge());
		System.out.println(stu3.getAddress());
	}
}
