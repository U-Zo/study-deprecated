package com.employee.entity;

import com.common.util.CommonUtil;

public class Engineer extends Employee {
    public Engineer() {
    }

    public Engineer(int empno, String ename, String loc, int sal, String hiredate, String state) {
        super(empno, ename, loc, sal, hiredate, state);
    }

    @Override
    public String toString() {
        return super.getEmpno() + "\t" + super.getEname() + "\t개발\t\t" + super.getLoc() +
                "\t\t" + CommonUtil.getCurrency(super.getSal()) + "\t\t\t\t\t" +
                super.getHiredate().substring(0, 10) + "\t\t" + super.getState();
    }
}
