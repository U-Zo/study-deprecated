import com.dto.Person;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("person.xml");
		Person xxx = ctx.getBean("person", Person.class);

		xxx.getInfo();
	}

}
