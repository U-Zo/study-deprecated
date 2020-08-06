package test2;

public class Test04 {

	public static void main(String[] args) {
		Student[] stdArr = {
				new Student("Kim", 100, 90, 95, 89),
				new Student("Lee", 60, 70, 99, 98),
				new Student("Park", 68, 86, 60, 40)
		};
		
		for (Student s : stdArr) {
			System.out.println("이름: " + s.getName() + "\t평균: "
					+ s.getAvg() + "\t학점: " + s.getGrade());
		}
	}

}
