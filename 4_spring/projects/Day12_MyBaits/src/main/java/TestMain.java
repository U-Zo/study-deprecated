import com.dto.DeptDTO;
import com.service.DeptService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("com/config/stu.xml");

        DeptService service = ctx.getBean(DeptService.class);

        List<DeptDTO> list = service.findAll();

        for (DeptDTO dto : list) {
            System.out.println(dto);
        }
    }
}
