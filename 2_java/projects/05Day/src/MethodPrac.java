
public class MethodPrac {

	public static void main(String[] args) {
		MethodPrac test = new MethodPrac();
		
		System.out.println("========== Start of main() ==========");
		int a = 10;
		int b = 20;
		
		System.out.println("num1 = " + a + ", num2 = " + b);
		System.out.println();
		
		int sum = test.sum(a, b);
		System.out.println(sum);
		
		int sub = test.sub(a, b);
		System.out.println(sub);
		
		int mux = test.mux(Integer.toString(a), b);
		System.out.println(mux);
		
		double div = test.div(b, a);
		System.out.println(div);
		
		double avg = test.avg(a, b);
		System.out.println(avg);
		
		String[] name = {"홍길동", "이순신"};
		test.printArr(name);
		
		String[][] mulName = {{"홍길동", "이순신"}, {"자바", "스프링"}, {"리액트"}};
		test.printMultiArr(mulName);
		
		System.out.println();		
		System.out.println("========== End of main() ==========");
	}

	public int sum(int num1, int num2) {
		System.out.print("sum() return: ");
		return num1 + num2;
	}

	public int mux(String str, int num) {
		System.out.print("mux() return: ");
		int strNum = Integer.parseInt(str);
		
		return strNum * num;
	}
	
	public int sub(int num1, int num2) {
		System.out.print("sub() return: ");
		return num1 - num2;
	}

	public double div(int num1, int num2) {
		System.out.print("div() return: ");
		return num1 / num2;
	}

	public double avg(int num1, int num2) {
		System.out.print("avg() return: ");
		return (num1 + num2) / 2;
	}

	public void printArr(String[] arr) {
		System.out.print("printArr() return: ");
		for (String i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void printMultiArr(String[][] arr) {
		System.out.print("printMulArr() return: ");
		for (String[] i : arr) {
			for (String j : i) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
	}

}
