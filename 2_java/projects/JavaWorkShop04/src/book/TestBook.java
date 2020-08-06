package book;

public class TestBook {

	public static void main(String[] args) {
		Book[] bl = {
				new Book("SQL Plus", 50000, 5.0),
				new Book("Java 2.0", 40000, 3.0),
				new Book("JSP Servlet", 60000, 6.0)
		};
		
		BookPrint bp = new BookPrint(bl);
		
		System.out.println("책이름\t\t가격\t할인율\t할인 후 금액");
		System.out.println("-----------------------------------------");
		bp.printBook();
	}

}
