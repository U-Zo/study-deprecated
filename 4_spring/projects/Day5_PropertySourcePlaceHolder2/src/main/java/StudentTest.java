
import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");

		ctx.close();
	}

}
