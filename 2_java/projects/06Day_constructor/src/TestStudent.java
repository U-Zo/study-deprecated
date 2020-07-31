
public class TestStudent {

	public static void main(String[] args) {
		// Student 객체 생성
		Student stu1 = new Student(); // default 생성자 호출
		Student stu2 = new Student();
		
		System.out.println(stu1.stuInfo());
		System.out.println(stu2.stuInfo());
	}

}
