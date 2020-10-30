import com.dto.Student;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");

		Student student = ctx.getBean("stu", Student.class);
		System.out.println(student.sayEcho());
//		System.out.println(student.callEcho());
//		System.out.println(student.callTest());
	}

}
