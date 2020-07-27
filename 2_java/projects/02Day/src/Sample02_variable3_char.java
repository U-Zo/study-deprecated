
public class Sample02_variable3_char {

	public static void main(String[] args) {
		char c = 'A';
		char c2 = '홍';
		char c3 = '\uD64D';
		System.out.println(c + " " + c2 + " " + c3);
		// escape 문자
		System.out.println("aaa\tbbb");
		System.out.println("aaa\nbbb");
		System.out.println("aaa\'bbb");
		System.out.println("aaa\"bbb");
		System.out.println("aaa\\bbb");
	}

}
