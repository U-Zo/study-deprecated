
public class Count {
	public static int count;
	private int num;
	
	public Count() {
		count++;
		num = count;
	}
	
	public int getNum() {
		return num;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(Count.getCount());
		
		Count c1 = new Count();
		System.out.println(c1.getNum());
		
		Count c2 = new Count();
		System.out.println(c2.getNum());
		System.out.println(Count.getCount());
	}

}
