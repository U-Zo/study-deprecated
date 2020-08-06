package com.emp;

import java.util.Date;
import java.util.Scanner;

public class TestEmp {
	public void printEmp(Emp e) {
		System.out.println(e.printInfo());
	}

	public void printEmpArr(Emp[] eArr) {
		for (Emp e : eArr) {
			printEmp(e);
		}
	}

	public void printChildData(Emp[] eArr) {
		for (Emp e : eArr) {
			if (e instanceof Man) {
				System.out.println("부서: " + ((Man) e).getDepart());
			} else if (e instanceof Eng) {
				System.out.println("기술: " + ((Eng) e).getSkill());
			}
		}
	}

	public void printChildData(Emp e) {
		if (e instanceof Eng) {
			System.out.println("Engineer: " + ((Eng) e).getName() + ", " + ((Eng) e).getSkill());
		} else if (e instanceof Man) {
			System.out.println("Manager: " + ((Man) e).getName() + ", " + ((Man) e).getDepart());
		} else if (e == null) {
			System.out.println("해당 사원이 없습니다.");
		}
	}

	public Emp searchChild(Emp[] eArr, String name) {
		Emp emp = null;

		for (Emp e : eArr) {
			if (e.getName().equals(name)) {
				emp = e;
			}
		}

		return emp;
	}

	public String searchDept(Emp[] eArr, String dept) {
		String result = "";

		for (Emp e : eArr) {
			if (e instanceof Man) {
				if (((Man) e).getDepart().equals(dept)) {
					result += e.getName() + " ";
				}
			}
		}

		return dept + "의 사원 목록\n" + result;
	}

	public Emp[] createEmpArr() {
		Emp[] eArr = { new Man("홍길동", "영업부"), new Eng("이순신", "제조업"), new Eng("강감찬", "연구업"), new Man("이완용", "영업부") };

		return eArr;
	}

	public static void main(String[] args) {
		Emp e = new Emp("홍길동");
		System.out.println(e);
		Emp m = new Man("이순신", "영업부");
		System.out.println(m);
		
//		TestEmp te = new TestEmp();
//		Emp[] eArr = te.createEmpArr();
//		Scanner sc = new Scanner(System.in);
//		te.printEmpArr(eArr);
//		te.printChildData(eArr);
//
//		while (true) {
//			System.out.print("찾을 사원의 이름을 입력하세요 (종료 q): ");
//			String name = sc.nextLine();
//			if (name.equals("q")) break;
//
//			Emp result = te.searchChild(eArr, name);
//			te.printChildData(result);
//		}
//
//		System.out.println(te.searchDept(eArr, "영업부"));
//		
//		Date d = new Date();
//		System.out.println(d); // 참조 변수만 넣을 시 jdk 가 자동으로 toString() 호출
//		System.out.println(d.toString());
//
//		sc.close();
	}
}
