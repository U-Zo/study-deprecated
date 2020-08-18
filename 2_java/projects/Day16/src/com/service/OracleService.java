package com.service;

import com.dao.OracleDAO;
import com.dto.Dept;

import java.sql.SQLException;
import java.util.ArrayList;

public class OracleService {
    private final OracleDAO dao;

    public OracleService() {
        dao = OracleDAO.getDao(); // DAO 생성
    }

    public ArrayList<Dept> select() throws SQLException {
        //Dao의 select함수 호출  실제 데이터 받아오기
        return dao.select();
    }
}
