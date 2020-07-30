
public class StringTest {

	public static void main(String[] args) {
		// new 사용
		String s = new String("hello");
		String s2 = new String("hello");
		System.out.println(s == s2); // false
		boolean result = s.equals(s2);
		System.out.println(result);
		
		String n = "hello";
		String n2 = "hello";
		System.out.println(n == n2); // true
		// hello 문자열을 만들고 그 문자열의 주소를 n과 n2에 각각 할당한 것
		System.out.println(n.equals(n2));
	}

}
