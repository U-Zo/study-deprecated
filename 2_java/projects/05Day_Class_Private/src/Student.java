
public class Student {
	// 인스턴스 변수, 멤버 변수
	// 메소드 밖에서 static(x)
	// new 생성 시, 힙(heap) 메모리에 생성
	// 존재 시점: 객체 생성 ~ 소멸
	// 자동으로 초기화
	private String name; // 다른 클래스에서 접근 불가
	private int age;
	private String address;
	
	public String stuInfo() {
		return name + "/" + age + "/" + address;
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
