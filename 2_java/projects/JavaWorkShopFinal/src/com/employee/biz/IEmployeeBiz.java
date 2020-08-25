package com.employee.biz;

import com.employee.entity.Employee;

import java.util.List;

public interface IEmployeeBiz {
    List<Employee> selectAllEmployee();

    List<Employee> searchList(String inputSubMenu, String searchWord);

    int createEmployeeNum();

    void employeeInsert(Employee emp);

    void employeeUpdate(Employee emp);

    void employeeDelete(int empno);

    void employeeService(int empno, String inputColumn);
}
