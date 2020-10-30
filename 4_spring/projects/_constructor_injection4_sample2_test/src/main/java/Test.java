
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class Test {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dao.xml");
		DeptService service = ctx.getBean("DeptService", DeptService.class);
		List<String> list = service.list();
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println(service);

	}

}
