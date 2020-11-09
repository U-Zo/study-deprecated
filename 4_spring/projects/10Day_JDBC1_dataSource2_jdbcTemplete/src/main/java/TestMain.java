import com.dao.TestDAO;
import com.dto.TestDTO;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class TestMain {

    public static void main(String[] arg) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("test.xml");
//        List<TestDTO> list=dao.selectByName("김혜빈" +
//                "");
//        for(TestDTO x:list){
//            System.out.println(x);
//        }

        TestDAO dao = ctx.getBean("dao", TestDAO.class);
        List<TestDTO> list = dao.select();

        for (TestDTO dto : list) {
            System.out.println(dto);
        }

        // System.out.println(dao.insert(11, "김혜빈", "과천"));

    }
}
