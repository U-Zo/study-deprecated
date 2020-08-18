import com.dto.Dept;
import com.service.OracleService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class OracleMain {
    public static void main(String[] args) {
        OracleService service = new OracleService();
        // service.insert(new Dept(91, "제조", "경기"));
        service.update(new Dept(91, "수정", "서울"));
        service.delete(91);
        System.out.println(service.selectByDeptNo(10));

        // 출력
        try {
            ArrayList<Dept> list = service.select();
            for (Dept dept : list) {
                System.out.println(dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println();
        HashMap<String, String> map = new HashMap<>();
        map.put("dname", "영업");
        map.put("loc", "제주");

        for (Dept dept : service.selectByNameLoc(map)) {
            System.out.println(dept);
        }

        for (Dept dept : service.selectByMap(map)) {
            System.out.println(dept);
        }
    }
}
