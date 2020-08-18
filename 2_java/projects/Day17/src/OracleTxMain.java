import com.dto.Dept;
import com.service.OracleTxService;

import java.util.ArrayList;

public class OracleTxMain {
    public static void main(String[] args) {
        OracleTxService service = new OracleTxService();
        ArrayList<Dept> list = null;

        list = service.select();
        for (Dept d : list) {
            System.out.println(d);
        }

        // service.insert(new Dept(14, "개발", "New York"));
        // service.update(new Dept(14, "기획", "New York"));
        // service.delete(14);

        service.insertDelete(new Dept(14, "개발", "판교"), 88);
    }
}
