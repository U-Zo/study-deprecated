import com.dto.Person;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");

		Person p = ctx.getBean("xxx", Person.class);
		System.out.println(p.getInfo());
	}
}
