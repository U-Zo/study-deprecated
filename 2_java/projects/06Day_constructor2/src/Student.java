
public class Student {
	// 인스턴스 변수, 멤버 변수
	// 메소드 밖에서 static(x)
	// new 생성 시, 힙(heap) 메모리에 생성
	// 존재 시점: 객체 생성 ~ 소멸
	// 자동으로 초기화
	private String name; // 다른 클래스에서 접근 불가
	private int age;
	private String address;
	private Book writtenBook;

	// 생성자 수정 - 생성과 동시에 받아온 값으로 초기화, 기본 생성자는 자동으로 정의x
	// 기본 생성자 명시
	public Student() {
	}

	public Student(String name, int age, String address) {
		System.out.println("Student() 생성자 호출");
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String stuInfo() {
		// return name + "/" + age + "/" + address;
		return getName() + "/" + getAge() + "/" + getAddress();
	}

	public Book getWrittenBook() {
		return this.writtenBook;
	}

	public void setWrittenBook(Book writtenBook) {
		this.writtenBook = writtenBook;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
}
