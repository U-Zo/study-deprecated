package com.service;

import com.dao.OracleDao;

import java.util.Set;

public class OracleService {
    OracleDao dao;

    public OracleService() {
        dao = new OracleDao();
    }

    public Set<?> select() {
        return dao.select();
    }
}
