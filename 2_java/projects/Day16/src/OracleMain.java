import com.dto.Dept;
import com.service.OracleService;

import java.sql.SQLException;
import java.util.ArrayList;

public class OracleMain {
    public static void main(String[] args) {
        OracleService service = new OracleService();
        try {
            ArrayList<Dept> list = service.select();
            for (Dept dept : list) {
                System.out.println(dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
