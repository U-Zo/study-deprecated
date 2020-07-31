
public class ArrayTest {
	public void printArr(int[] arr) {
		System.out.println("printArr 호출 ======");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void printForEach(int[] arr) {
		System.out.println("printForeach 호출 =====");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public int sum(int[] arr) {
		int a = 1;
		
		return a;
	}

	public static void main(String[] args) {
		// 1. 배열 선언
		// 데이터타입 [] 변수명;
		System.out.println("main 시작 =================");
		ArrayTest test = new ArrayTest();
		int[] num;
		// 2. 배열 생성
		// 변수명 = new 데이터타입[크기];
		num = new int[3];
		// 3. 배열초기화
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		// num[3] = 40; //java.lang.ArrayIndexOutOfBoundsException
		
		test.printArr(num);
		
		int[] num2;
		// 2. 배열 생성
		// 변수명 = new 데이터타입[크기];
		num2 = new int[3];
		// 3. 배열초기화
		num2[0] = 10;
		num2[1] = 20;
		num2[2] = 30;
		
		test.printForEach(num2);
		
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println("배열크기(길이)" + num.length);
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(">>" + num[i]);
//		}
//		// foreach문
//		for (int x : num) {
//			System.out.println(x);
//		}
		System.out.println("main 끝 ==============");
	}

}
