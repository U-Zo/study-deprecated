package test1;

public class Test04 {
	public static Student getMax(Student a, Student b) {
		return a.getAge() > b.getAge()
				? a : b;
	}

	public static void main(String[] args) {
		Student[] stdArr = {
				new Student("홍길동", 15, 170, 80),
				new Student("한사람", 13, 180, 70),
				new Student("임걱정", 16, 175, 65)
		};
		
		Student maxAge = stdArr[0];
		
		for (Student s : stdArr) {
			maxAge = getMax(maxAge, s);
		}
		
		System.out.println(maxAge);
	}

}
