import com.dao.TestDAO;
import com.dto.TestDTO;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;

public class TestMain {
    public static void main(String [] arg){
        GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("test.xml");
        TestDAO dao=ctx.getBean("testDAO",TestDAO.class);
        ArrayList<TestDTO> list=dao.select();
        for(TestDTO x:list){
            System.out.println(x);
        }

    }
}
