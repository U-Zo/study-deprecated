import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {

		// IoC 컨테이너
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");

		Student stu = ctx.getBean("firstStudent", Student.class);
		System.out.println(stu.getInfo());

		Map<String, Cat> map = stu.getCatMap();
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(map.get(key).getCatInfo());
		}

		Properties properties = stu.getPhones();
		Enumeration<Object> e = properties.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}
}
