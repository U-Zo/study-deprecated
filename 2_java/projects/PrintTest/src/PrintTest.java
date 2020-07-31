
public class PrintTest {

	public static void main(String[] args) {
		System.out.println("김우조 남 " + 2020);
		System.out.println(2011 + "2012");
		System.out.println(2011 + 2012);
		System.out.println(2011 + "" + 2012);
		System.out.println(2011 + 2012 + "");
		System.out.println("" + 2011 + 2012);
		System.out.print("김우조 ");
		System.out.print("2020 ");
		System.out.print("남\n");
		System.out.printf("%s %d %c %.2f %b",
				"김우조", 2020, '남', 1234.567, false);
		// %s: 문자열, %d: 숫자, %c: 문자,
		// %.2f: 소숫점 2자리 까지 반올림 출력,
		// %b: boolean 타입
	} // end of main

}