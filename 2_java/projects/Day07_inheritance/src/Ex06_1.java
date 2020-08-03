class Employee {
	String name;
	int salary;
	
	public String getEmployee() {
		return name + " " + salary;
	}
	
	public Employee() {
		System.out.println("Employee 기본 생성자 호출");
	}
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		System.out.println("Employee 생성자 호출");
	}
}

class Manager extends Employee {
	String depart;
	
	public String getManager() {
		return name + " " + salary + " " + depart;
	}
	
	public Manager(String name, int salary, String depart) {
		super(); // 부모 기본 생성자 호출
		this.name = name;
		this.salary = salary;
		this.depart = depart;
		System.out.println("Manager 자식생성자 호출 =====");
	}
}
public class Ex06_1 {

	public static void main(String[] args) {
//		Employee emp = new Employee("홍길동", 2000);
		Manager man = new Manager("이순신", 4000, "개발");
//		System.out.println(emp.getEmployee());
		System.out.println(man.getManager());
	}

}
