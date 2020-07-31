
public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.name = "7년 후";
		b1.price = 100;
		
		b2.name = "템테이션";
		b2.price = 1;
		
		System.out.println(b1.name);
		System.out.println(b1.price);
		System.out.println(b2.name);
		System.out.println(b2.price);
	}

}
