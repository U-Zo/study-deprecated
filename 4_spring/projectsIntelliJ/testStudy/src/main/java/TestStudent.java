import com.service.DeptService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("stu.xml");

        DeptService deptService = ctx.getBean("deptService", DeptService.class);
        List<String> list = deptService.getDao().list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
