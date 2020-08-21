import com.dto.Dept;
import com.service.OracleMyBatisService;

import java.util.List;

public class OracleMyBatisMain3 {
    public static void main(String[] args) {
        OracleMyBatisService service = new OracleMyBatisService();
        List<Dept> deptList = null;

        System.out.println("selectAll ===================");
        deptList = service.selectAll();
        for (Dept dept : deptList) {
            System.out.println(">>>" + dept);
        }

        System.out.println();
        System.out.println("selectTopN =======================");
        deptList = service.selectTopN(3, 3);
        for (Dept dept : deptList) {
            System.out.println(">>>" + dept);
        }
    }
}
