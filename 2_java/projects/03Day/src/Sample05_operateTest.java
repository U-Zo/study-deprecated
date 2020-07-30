
public class Sample05_operateTest {

	public static void main(String[] args) {
		// 대입 연산자
		int x = 10;
		int x2 = x;
		x2 += x; // x2 = x2 + x
		System.out.println(x2);
		x2 -= x; // x2 = x2 - x
		System.out.println(x2);
		x2 *= x; // x2 = x2 * x
		System.out.println(x2);
		x2 /= x; // x2 = x2 / x
		System.out.println(x2);
		x2 %= x; // x2 = x2 % x
		System.out.println(x2);
		
		// 증감 연산자
		int k = 10;
		int a = --k;
		System.out.println(a + " " + k);
		int b = k--; // 후치
		System.out.println(b + " " + k);
		
		// 비교 연산자
		int xyz = 5;
		int xyz2 = 3;
		boolean result = xyz == xyz2;
		System.out.println(xyz == xyz2);
		System.out.println(xyz != xyz2);
		System.out.println(xyz > xyz2);
		System.out.println(xyz >= xyz2);
		System.out.println(xyz < xyz2);
		System.out.println(xyz <= xyz2);
		System.out.println(result);
		System.out.println();
		
		// 논리 연산자
		
		System.out.println(3 == 4 && 4 > 3);
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// 삼항 연산자
		int xxx = 3 == 4 ? 100 : 200;
		String xxx2 = 3 == 4 ? "a" : "b";
		System.out.println(xxx);
		System.out.println(xxx2);
		
		int _a = 10;
		int _b = 20;
		int max = _a > _b ? _a : _b;
		System.out.println(max);
		
		int n1 = 40;
		int n2 = 50;
		int n3 = 30;
		max = (n1 > n2 ? n1 : n2) > n3
				? (n1 > n2 ? n1 : n2) : n3;
		System.out.println(max);
	}

}
