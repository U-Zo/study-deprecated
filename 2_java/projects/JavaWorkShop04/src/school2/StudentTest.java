package school2;

public class StudentTest {
	
	public static Student getMaxAge(Student a, Student b) {
		return a.getAge() > b.getAge() ? a : b;
	}
	
	public static Student getMinAge(Student a, Student b) {
		return a.getAge() < b.getAge() ? a : b;
	}
	
	public static Student getMaxHeight(Student a, Student b) {
		return a.getHeight() > b.getHeight() ? a : b;
	}
	
	public static Student getMinHeight(Student a, Student b) {
		return a.getHeight() < b.getHeight() ? a : b;
	}
	
	public static Student getMaxWeight(Student a, Student b) {
		return a.getWeight() > b.getWeight() ? a : b;
	}
	
	public static Student getMinWeight(Student a, Student b) {
		return a.getWeight() < b.getWeight() ? a : b;
	}

	public static void main(String[] args) {
		Student[] studentArray = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 170, 80);
		studentArray[1] = new Student("한사람", 13, 180, 70);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		int sumAge = 0;
		int sumHeight = 0;
		int sumWeight = 0;
		
		Student maxAge = studentArray[0];
		Student minAge = studentArray[0];
		Student maxHeight = studentArray[0];
		Student minHeight = studentArray[0];
		Student maxWeight = studentArray[0];
		Student minWeight = studentArray[0];
		
		// 배열에 있는 객체 정보 모두 출력
		System.out.println("이름\t나이\t신장\t몸무게");
		for (Student i : studentArray) {
			System.out.println(i.studentInfo());
			sumAge += i.getAge();
			sumHeight += i.getHeight();
			sumWeight += i.getWeight();
			maxAge = getMaxAge(maxAge, i);
			minAge = getMinAge(minAge, i);
			maxHeight = getMaxHeight(maxHeight, i);
			minHeight = getMinHeight(minHeight, i);
			maxWeight = getMaxWeight(maxWeight, i);
			minWeight = getMinWeight(minWeight, i);
		}
		
		System.out.println();
		System.out.printf("나이 평균: %.3f\n", (double)sumAge / studentArray.length);
		System.out.printf("신장 평균: %.3f\n", (double)sumHeight / studentArray.length);
		System.out.printf("몸무게 평균: %.3f\n", (double)sumWeight / studentArray.length);
		System.out.println();
		
		System.out.println("나이가 가장 많은 학생: " + maxAge.getName());
		System.out.println("나이가 가장 적은 학생: " + minAge.getName());
		System.out.println("신장이 가장 큰 학생: " + maxHeight.getName());
		System.out.println("신장이 가장 작은 학생: " + minHeight.getName());
		System.out.println("몸무게가 가장 많이 나가는 학생: " + maxWeight.getName());
		System.out.println("몸무게가 가장 적게 나가는 학생: " + minWeight.getName());
	}

}
