package com.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MyProductDAO;
import com.dto.MyProductDTO;

public class MyProductService {
    private MyProductDAO dao;

    public MyProductService() {
        dao = new MyProductDAO();
    }

    public List<MyProductDTO> select() {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        List<MyProductDTO> list = null;
        try {
            list = dao.select(session);
        } finally {
            session.close();
        }

        return list;
    }
    
    public int delete(String prodId) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        int n = 0;
        try {
            n = dao.delete(session, prodId);
            session.commit();
        } finally {
            session.close();
        }
        
        return n;
    }
    
    public int deleteAll(ArrayList<String> list) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        int n = 0;
        try {
            n = dao.deleteAll(session, list);
            session.commit();
        } finally {
            session.close();
        }
        
        return n;
    }
}
