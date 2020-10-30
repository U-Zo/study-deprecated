
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("echo1.xml", "echo2.xml");

		Person p = ctx.getBean("onePerson", Person.class);
		System.out.println(p.getInfo());

	}

}
