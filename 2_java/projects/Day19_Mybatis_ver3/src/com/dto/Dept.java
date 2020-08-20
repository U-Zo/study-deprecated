package com.dto;

import java.sql.PreparedStatement;

// Dept 테이블의 하나의 레코드 저장용도
public class Dept {
    // 멤버 변수명은 데이터베이스의 컬럼명과 동일해야 함
    private int deptno;
    private String dname;
    private String loc;

    // 기본 생성자는 반드시 있어야 함
    public Dept() {
    }

    public Dept(int deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept[" +
                "deptno=" + deptno +
                ", dname=" + dname +
                ", loc=" + loc +
                ']';
    }
}
