package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.StdDAO;
import com.dto.StdDTO;

public class StdService {
    private StdDAO dao;

    public StdService() {
        dao = new StdDAO();
    }

    public List<StdDTO> selectAllStd() {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        List<StdDTO> list = null;
        try {
            list = dao.selectAllStd(session);
        } finally {
            session.close();
        }

        return list;
    }
}
