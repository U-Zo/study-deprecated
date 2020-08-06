package book;

public class BookPrint {
	private Book[] bl;
	
	public BookPrint(Book[] bl) {
		this.bl = bl;
	}
	
	public void printBook() {
		for (Book book : bl) {
			System.out.println(book.getBookName() + "\t" + book.getBookPrice()
			+ "원\t" + book.getBookDiscountRate() + "%\t" + book.getDiscountBookPrice() + "원");
		}
	}
}
