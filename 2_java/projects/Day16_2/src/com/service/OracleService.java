package com.service;

import com.dao.OracleDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class OracleService {
    private final OracleDAO dao;

    public OracleService() {
        dao = OracleDAO.getDao(); // DAO 생성
    }

    public ArrayList<Dept> select() throws SQLException {
        //Dao의 select함수 호출  실제 데이터 받아오기
        return dao.select();
    }

    public void insert(Dept dept) {
        dao.insert(dept);
    }

    public void update(Dept dept) {
        try {
            dao.update(dept);
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(int deptno) {
        try {
            dao.delete(deptno);
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public Dept selectByDeptNo(int deptno) {
        Dept dept = null;
        try {
            dept = dao.selectByDeptNo(deptno);
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return dept;
    }

    public ArrayList<Dept> selectByNameLoc(HashMap<String, String> map) {
        ArrayList<Dept> list = null;

        try {
            list = dao.selectByNameLoc(map);
        } catch (RecordNotFoundException e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<Dept> selectByMap(HashMap<String, String> map) {
        ArrayList<Dept> list = null;

        try {
            list = dao.selectByMap(map);
        } catch (RecordNotFoundException e) {
            e.printStackTrace();
        }

        return list;
    }
}
