
public class ArrayTest3 {

	public static void main(String[] args) {
		int[] kor = new int[3];
		int[] eng = new int[3];
		int kSum = 0;
		int eSum = 0;
		
		kor[0] = 100;
		kor[1] = 80;
		kor[2] = 80;
		eng[0] = 90;
		eng[1] = 75;
		eng[2] = 60;
		
		for (int i = 0; i < kor.length; i++) {
			kSum += kor[i];
		}
		
		for (int x : eng) {
			eSum += x;
		}
		
		System.out.println("국어 점수 평균: " + kSum / kor.length);
		System.out.println("영어 점수 평균: " + eSum / eng.length);
	}

}
