import com.dto.Student;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("student.xml");
		Student xxx = ctx.getBean("xxx", Student.class);

		System.out.println(xxx.callEcho());
		System.out.println(xxx.sayEcho());
	}

}
