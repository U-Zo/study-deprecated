
public class PrintArr {
	private int sum;
	private double avg;
	ArrAvg arrAvg;
	
	public double getAvg() {
		return avg;
	}
	
	public int calcSum(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		arrAvg = new ArrAvg();
		avg = arrAvg.calcAvg(sum, arr.length);
		
		return sum;
	}
}
