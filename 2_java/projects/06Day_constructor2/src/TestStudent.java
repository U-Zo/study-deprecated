
public class TestStudent {

	public static void main(String[] args) {
		// Student 객체 생성
		Student stu1 = new Student("홍길동", 20, "강남구"); // default 생성자 호출
		Student stu2 = new Student("이순신", 44, "서초구");

		Book book1 = new Book();

		book1.setTitle("7년 후");

		stu1.setWrittenBook(book1);
		stu2.setWrittenBook(new Book("템테이션", 10000));

		System.out.println(stu1.stuInfo());
		System.out.println(stu2.stuInfo());

		Book stu1Book = stu1.getWrittenBook();
		String stu1BookTitle = stu1Book.getTitle();
		int stu1BookPrice = stu1Book.getPrice();

//		System.out.println(stu1.getWrittenBook().getTitle()
//				+ "/" + stu1.getWrittenBook().getPrice());

		System.out.println(stu1BookTitle + "/" + stu1BookPrice);

		// book 객체를 set 하지 않았음 -> 오류
		System.out.println(stu2.getWrittenBook().getTitle()
				+ "/" + stu2.getWrittenBook().getPrice());
	}

}
