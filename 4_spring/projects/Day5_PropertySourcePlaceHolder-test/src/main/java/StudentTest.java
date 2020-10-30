
import com.service.DeptService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");
		DeptService service = ctx.getBean("service", DeptService.class);

		System.out.println(service.getDao().list());
		System.out.println(service);

		ctx.close();
	}

}
