import com.dto.Dept;
import com.service.OracleMyBatisService;

import java.util.List;

public class OracleMyBatisMain {
    public static void main(String[] args) {
        OracleMyBatisService service = new OracleMyBatisService();
        List<Dept> list = service.select(); // 서비스 클래스 메서드 호출

        for (Dept d : list) {
            System.out.println(d);
        }
    }
}
