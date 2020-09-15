package com.dto;

public class EmpDTO {
  private int empno;
  private String ename;
  private int sal;
  private String hiredate;
  private int deptno;

  public EmpDTO() {
  }

  public EmpDTO(int empno, String ename, int sal, String hiredate, int deptno) {
    this.empno = empno;
    this.ename = ename;
    this.sal = sal;
    this.hiredate = hiredate;
    this.deptno = deptno;
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

  public int getDeptno() {
    return deptno;
  }

  public void setDeptno(int deptno) {
    this.deptno = deptno;
  }
}
