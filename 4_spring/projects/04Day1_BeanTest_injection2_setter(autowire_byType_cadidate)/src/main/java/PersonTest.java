
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("person.xml");

		Person p = ctx.getBean("onePerson", Person.class);
		System.out.println(p.getInfo());

	}

}
