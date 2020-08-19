import com.dto.Dept;
import com.service.OracleMyBatisService;

import java.util.List;

public class OracleMyBatisMain {
    public static void main(String[] args) {
        OracleMyBatisService service = new OracleMyBatisService();
        List<Dept> list = service.selectAll();

//        for (Dept d : list) {
//            System.out.println(d);
//        }

        Dept dept = service.selectByDeptno(20);
        System.out.println(dept);

        // service.insert(new Dept(66, "퇴근", "집"));
        service.delete(66);
    }
}
