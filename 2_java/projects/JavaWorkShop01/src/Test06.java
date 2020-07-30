
public class Test06 {

	public static void main(String[] args) {
		int i = 15;
		String result = i % 2 == 1 ? "홀수" : "짝수";
		System.out.println("선언 변수 " + i + "일 때 결과:\n"
				+ "숫자 " + i + "는 " + result + "입니다.");
		
		String result2 = i % 3 == 0 && i % 5 == 0 ? "맞습니다." : "아닙니다.";
		System.out.println("숫자 " + i + "는 3의 배수면서 5의 배수가 "
				+ result2);
	}

}
