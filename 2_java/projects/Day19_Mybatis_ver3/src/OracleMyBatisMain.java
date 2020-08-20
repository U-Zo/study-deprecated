import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class OracleMyBatisMain {
    public static void main(String[] args) {
        OracleMyBatisService service = new OracleMyBatisService();
        System.out.println("부서번호가 20인 부서 검색 =================");
        Dept dept = service.selectByDeptno(20);
        System.out.println(dept);
        System.out.println();

        // service.insert(new Dept(66, "퇴근", "집"));
        System.out.println("부서번호가 15인 부서 삭제 =================");
        service.delete(15);
        System.out.println();
        System.out.println("부서번호가 15인 부서 수정 =================");
        service.update(new Dept(15, "개발", "서울"));
        System.out.println();
        System.out.println("모든 부서 검색 =================");
        List<Dept> list = service.selectAll();

        for (Dept d : list) {
            System.out.println(d);
        }

        System.out.println();
        System.out.println("부서 개수 검색 =================");
        System.out.println(service.deptRecordCount());
        System.out.println();
        System.out.println("부서명과 지역으로 부서 검색 =================");
        try {
            list = service.selectByDeptNameAndLoc(new Dept(0, null, null));
            for (Dept d : list) {
                System.out.println(d);
            }
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("HashMap 으로 부서 검색 =================");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("min", 10);
        map.put("max", 30);
        try {
            list = service.selectByHashMap(map);
            for (Dept d : list) {
                System.out.println(d);
            }
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("11, 12, 40 부서 검색 =================");
        map.clear();
        map.put("num1", 11);
        map.put("num2", 12);
        map.put("num3", 40);
        try {
            list = service.selectByDeptNoIn(map);
            for (Dept d : list) {
                System.out.println(d);
            }
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("부서번호로 검색, HashMap 받아와서 출력 =================");
        HashMap<String, String> map2 = null;
        try {
            map2 = service.selectByDeptNoHashMap(30);
            Set<String> keys = map2.keySet();
            for (String key : keys) {
                System.out.println(key);
            }

            System.out.println(map2.get("DNAME"));
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
