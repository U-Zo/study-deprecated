package com.employee.biz;

import com.config.MySqlSessionFactory;
import com.employee.dao.EmployeeDAO;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeBiz implements IEmployeeBiz {
    private EmployeeDAO dao;

    public EmployeeBiz() {
        dao = new EmployeeDAO();
    }

    @Override
    public List<Employee> selectAllEmployee() {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        List<Employee> list = new ArrayList<>();
        List<HashMap<String, Object>> mapList = null;

        try {
            mapList = dao.selectAllEmployee(session);
        } finally {
            session.close();
        }

        for (HashMap<String, Object> map : mapList) {
            int empno = ((BigDecimal) map.get("EMPNO")).intValue();
            String ename = (String) map.get("ENAME");
            String dname = (String) map.get("DNAME");
            String loc = (String) map.get("LOC");
            int sal = ((BigDecimal) map.get("SAL")).intValue();
            String hiredate = (String) map.get("HIREDATE");
            String state = (String) map.get("STATE");
            if (dname.equals("영업")) {
                Sales sales = new Sales(empno, ename, loc, sal, hiredate, state, sal * Sales.COMMISSION_RATE);
                list.add(sales);
            } else if (dname.equals("개발")) {
                Engineer engineer = new Engineer(empno, ename, loc, sal, hiredate, state);
                list.add(engineer);
            } else {
                Employee employee = new Employee(empno, ename, loc, sal, hiredate, state);
                list.add(employee);
            }
        }

        return list;
    }

    @Override
    public List<Employee> searchList(String inputSubMenu, String searchWord) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        List<HashMap<String, Object>> mapList = null;
        List<Employee> list = new ArrayList<>();

        try {
            mapList = dao.searchList(session, inputSubMenu, searchWord);
        } catch (DataNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }

        for (HashMap<String, Object> map : mapList) {
            int empno = ((BigDecimal) map.get("EMPNO")).intValue();
            String ename = (String) map.get("ENAME");
            String dname = (String) map.get("DNAME");
            String loc = (String) map.get("LOC");
            int sal = ((BigDecimal) map.get("SAL")).intValue();
            String hiredate = (String) map.get("HIREDATE");
            String state = (String) map.get("STATE");
            if (dname.equals("영업")) {
                Sales sales = new Sales(empno, ename, loc, sal, hiredate, state, sal * Sales.COMMISSION_RATE);
                list.add(sales);
            } else if (dname.equals("개발")) {
                Engineer engineer = new Engineer(empno, ename, loc, sal, hiredate, state);
                list.add(engineer);
            } else {
                Employee employee = new Employee(empno, ename, loc, sal, hiredate, state);
                list.add(employee);
            }
        }

        return list;
    }

    @Override
    public int createEmployeeNum() {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        int num = 0;
        try {
            num = dao.createEmployeeNum(session);
        } finally {
            session.close();
        }

        return num;
    }

    @Override
    public void employeeInsert(Employee emp) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        try {
            dao.employeeInsert(session, emp);
            session.commit();
        } catch (DataNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
    }

    @Override
    public void employeeUpdate(Employee emp) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        try {
            dao.employeeUpdate(session, emp);
            session.commit();
        } catch (DataNotFoundException e) {
            System.out.println(e.getMessage());
            session.rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void employeeDelete(int empno) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        try {
            dao.employeeDelete(session, empno);
            session.commit();
        } catch (DataNotFoundException e) {
            System.out.println(e.getMessage());
            session.rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void employeeService(int empno, String inputColumn) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        try {
            dao.employeeService(session, empno, inputColumn);
            session.commit();
        } catch (DataNotFoundException e) {
            System.out.println(e.getMessage());
            session.rollback();
        } finally {
            session.close();
        }
    }
}
