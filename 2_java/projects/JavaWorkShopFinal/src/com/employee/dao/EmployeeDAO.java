package com.employee.dao;

import com.employee.entity.Employee;
import com.employee.exception.DataNotFoundException;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

public class EmployeeDAO {
    public List<HashMap<String, Object>> selectAllEmployee(SqlSession session) {
        List<HashMap<String, Object>> list = null;
        list = session.selectList("employee.selectAllEmployee");

        return list;
    }

    public List<Employee> searchList(SqlSession session, String inputSubMenu, String searchWord) throws DataNotFoundException {
        List<Employee> list = null;
        HashMap<String, String> map = new HashMap<>();
        map.put("inputSubMenu", inputSubMenu);
        map.put("searchWord", searchWord);
        list = session.selectList("employee.searchList", map);
        if (list == null) throw new DataNotFoundException("일치하는 사원이 없습니다.");

        return list;
    }

    public int createEmployeeNum(SqlSession session) {
        int num = 0;
        num = session.selectOne("employee.createEmployeeNum");

        return num;
    }

    public void employeeInsert(SqlSession session, Employee emp) throws DataNotFoundException {
        int num = 0;
        num = session.insert("employee.employeeInsert", emp);
        if (num == 0) throw new DataNotFoundException("에러발생: " + emp.getEmpno() + "과 일치하는 사원이 없습니다.");
    }

    private Employee searchEmployee(SqlSession session, int empno) throws DataNotFoundException {
        Employee emp = session.selectOne("searchEmployee", empno);
        if (emp == null) throw new DataNotFoundException("에러발생: " + empno + "과 일치하는 사원이 없습니다.");

        return emp;
    }

    public void employeeUpdate(SqlSession session, Employee emp) throws DataNotFoundException {
        int num = 0;
        Employee employee = null;

        employee = searchEmployee(session, emp.getEmpno());
        if (!emp.getEname().equals("")) employee.setEname(emp.getEname());
        if (!emp.getDname().equals("")) {
            if (emp.getDname().equals("1")) employee.setDname("영업");
            else if (emp.getDname().equals("2")) employee.setDname("개발");
        }

        if (!emp.getLoc().equals("")) employee.setLoc(emp.getLoc());
        if (emp.getSal() != 0) employee.setSal(emp.getSal());
        num = session.update("employee.employeeUpdate", emp);
        if (num == 0) throw new DataNotFoundException("에러발생: " + emp.getEmpno() + "과 일치하는 사원이 없습니다.");
    }

    public void employeeDelete(SqlSession session, int empno) throws DataNotFoundException {
        int num = 0;
        num = session.delete("employee.employeeDelete", empno);
        if (num == 0) throw new DataNotFoundException("에러발생: " + empno + "과 일치하는 사원이 없습니다.");
    }

    public void employeeService(SqlSession session, int empno, String inputColumn) throws DataNotFoundException {
        int num = 0;
        Employee emp = null;
        String preState = null;
        String curState = null;
        emp = searchEmployee(session, empno);
        preState = emp.getState();
        HashMap<String, Object> map = new HashMap<>();
        map.put("empno", empno);
        map.put("inputColumn", inputColumn);
        num = session.update("employee.employeeService", map);
        emp = searchEmployee(session, empno);
        curState = emp.getState();
        System.out.println(preState + "중에서 " + curState + "중으로 변경되었습니다.");
        if (num == 0) throw new DataNotFoundException("에러발생: " + empno + "과 일치하는 사원이 없습니다.");
    }
}
