import com.dto.Dept;
import com.service.OracleMyBatisService;

import java.util.Arrays;
import java.util.List;

public class OracleMyBatisMain2 {
    public static void main(String[] args) {
        OracleMyBatisService service = new OracleMyBatisService();
        Dept dept1 = new Dept(22, "우조", "인천");
        Dept dept2 = new Dept(23, "우조", "인천");
        List<Dept> list = null;
        list = Arrays.asList(dept1, dept2);
        // service.multiDeleteDept(list);
        // List<Dept> depts = Arrays.asList(new Dept(12, "", ""), new Dept(13, "", ""));
        service.multiInsert(list);
        list = service.selectAll();
        for (Dept d : list) {
            System.out.println(d);
        }
    }
}
