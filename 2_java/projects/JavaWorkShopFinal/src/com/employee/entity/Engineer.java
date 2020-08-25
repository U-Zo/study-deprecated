package com.employee.entity;

public class Engineer extends Employee {
    public Engineer() {
    }

    public Engineer(int empno, String ename, String dname, String loc, int sal, String hiredate, String state) {
        super(empno, ename, dname, loc, sal, hiredate, state);
    }
}
