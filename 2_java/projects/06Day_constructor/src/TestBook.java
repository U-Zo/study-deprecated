
public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.setName("안녕하세요");
		b1.setPrice(10000);
		
		b2.setName("저는 책입니다.");
		b2.setPrice(100000);
		
		System.out.println(b1.getName());
		System.out.println(b1.getPrice());
		System.out.println(b2.getName());
		System.out.println(b2.getPrice());
	}

}
