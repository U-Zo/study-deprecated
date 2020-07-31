
public class BookTest {

	public static void main(String[] args) {
		// 객체 배열 선언
		Book[] bookList = new Book[3];

		// 배열에 담을 객체 생성, 객체별 멤버 변수 초기화
		Book book1 = new Book();
		book1.title = "홍길동전";
		book1.price = 1000;

		Book book2 = new Book();
		book2.title = "삼국지";
		book2.price = 2000;

		Book book3 = new Book();
		book3.title = "별주부전";
		book3.price = 3000;

		bookList[0] = book1;
		bookList[1] = book2;
		bookList[2] = book3;

		// 배열 갯수 확인
		System.out.println(bookList.length);

		for (int i = 0; i < bookList.length; i++) {
			// bookList[i].printInfo();
			System.out.println(bookList[i].title + "\t" + bookList[i].price);
		}

		System.out.println();

		for (Book b : bookList) {
			b.printInfo();
		}
	}

}
