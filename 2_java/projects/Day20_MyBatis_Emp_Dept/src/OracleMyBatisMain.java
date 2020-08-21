import com.dto.Dept;
import com.dto.Emp;
import com.service.OracleMyBatisDeptService;
import com.service.OracleMyBatisEmpService;

import java.util.List;

public class OracleMyBatisMain {
    public static void main(String[] args) {
        OracleMyBatisEmpService empService = new OracleMyBatisEmpService();
        OracleMyBatisDeptService deptService = new OracleMyBatisDeptService();
        List<Emp> empList = null;
        List<Dept> deptList = null;
        Emp emp = null;
        Dept dept = null;

        empList = empService.selectAll();
        System.out.println("Emp 정보 출력 ===============");
        for (Emp e : empList) {
            System.out.println(e);
        }

        deptList = deptService.selectAll();
        System.out.println();
        System.out.println("Dept 정보 출력 ===============");
        for (Dept d : deptList) {
            System.out.println(d);
        }

        System.out.println();
        System.out.println("Emp empno 으로 검색 출력 ===============");
        emp = empService.selectByEmpno(101);
        System.out.println(emp);

        System.out.println();
        System.out.println("Dept deptno 으로 검색 출력 ===============");
        dept = deptService.selectByDeptno(10);
        System.out.println(dept);

        System.out.println();
        System.out.println("Dept insert 으로 검색 출력 ===============");
        deptService.insert(new Dept(14, "우조", "인천"));
    }
}
