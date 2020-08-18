import com.biz.EmpBiz;
import com.common.util.JdbcTemplate;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

import java.util.ArrayList;
import java.util.Date;

public class EmpTest {
    public static void main(String[] args) {
        EmpBiz empBiz = new EmpBiz();
        ArrayList<EmpDTO> list = empBiz.selectAllEmp(); // empBiz 객체의 selectAllEmp() 호출 및 반환 받은 list 객체 저장

        for (EmpDTO e : list) { // list 객체의 모든 EmpDTO 객체 정보 출력
            System.out.println(e);
        }

//        try {
//            System.out.println(empBiz.selectDetailEmp(105));
//            // empBiz.empDelete(103);
//            empBiz.empUpdate(new EmpDTO(103, "우조", "개발", 7839, new Date().toString(), 4000, 0, 40));
//        } catch (DataNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

    } //end main
} //end class
