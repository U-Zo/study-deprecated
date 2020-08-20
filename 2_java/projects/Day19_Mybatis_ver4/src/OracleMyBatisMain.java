import com.dto.Emp;
import com.service.OracleMyBatisService;

import java.util.List;

public class OracleMyBatisMain {
    public static void main(String[] args) {
        OracleMyBatisService service = new OracleMyBatisService();

        List<Emp> list = null;

        // service.insert(new Emp(102, "우조", "개발", 7839, "2020-08-20", 4000, 500, 13));
        service.update(new Emp(102, "우조", "개발", null, "2020-08-20", 5000, 500, 13));

        // service.delete(102);

        list = service.selectAll();
        for (Emp e : list) {
            System.out.println(e);
        }
    }
}
