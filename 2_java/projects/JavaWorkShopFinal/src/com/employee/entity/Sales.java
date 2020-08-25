package com.employee.entity;

import com.common.util.CommonUtil;

public class Sales extends Employee {
    public static final double COMMISSION_RATE = 0.2;
    private double commission;

    public Sales() {
    }

    public Sales(int empno, String ename, String dname, String loc, int sal, String hiredate, String state, double commission) {
        super(empno, ename, dname, loc, sal, hiredate, state);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return super.getEmpno() + "\t" + super.getEname() + "\t" + super.getDname() +
                "\t\t" + super.getLoc() + "\t\t" + CommonUtil.getCurrency(super.getSal()) +
                "\t\t" + CommonUtil.getCurrency((int) commission) +
                "\t\t" + super.getHiredate().substring(0, 10) +
                "\t\t" + super.getState();
    }
}
