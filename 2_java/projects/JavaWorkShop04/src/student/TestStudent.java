package student;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Kim", 100, 90, 95, 89);
		Student s2 = new Student("Lee", 60, 70, 99, 98);
		Student s3 = new Student("Park", 68, 86, 60, 40);
		Student max = new Student();
		Student[] sl = {s1, s2, s3};
		
//		for (Student i : sl) {
//			System.out.println(i.getName() + " 평균: " + i.getAvg()
//				+ " 학점: " + i.getGrade() + "학점");
//		}
		
		for (int i = 0; i < sl.length; i++) {
			if (max.getAvg() < sl[i].getAvg()) {
				max = sl[i];
			}
			
			System.out.println(sl[i].getName() + " 평균: " + sl[i].getAvg()
			+ " 학점: " + sl[i].getGrade() + "학점");
		}
		System.out.println("우등생은");		
		System.out.println(max.getName() + " 평균: " + max.getAvg()
				+ " 학점: " + max.getGrade() + "학점");
	}

}
