package com.employee.entity;

public class Employee {
    private int empno;
    private String ename;
    private String loc;
    private int sal;
    private String hiredate;
    private String state;

    public Employee() {
    }

    public Employee(int empno, String ename, String loc, int sal, String hiredate, String state) {
        this.empno = empno;
        this.ename = ename;
        this.loc = loc;
        this.sal = sal;
        this.hiredate = hiredate;
        this.state = state;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
