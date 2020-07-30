
public class Test03 {

	public static void main(String[] args) {
		char ch = 'a';
		boolean b = (ch >= 'A' && ch <= 'Z')
				|| (ch >= 'a' && ch <= 'z');
		System.out.println(b);
	}

}
