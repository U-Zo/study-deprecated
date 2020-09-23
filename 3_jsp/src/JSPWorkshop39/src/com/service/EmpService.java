package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;
import com.dto.PageDTO;

public class EmpService {

    EmpDAO dao;

    public EmpService() {
        dao = new EmpDAO();
    }

    public PageDTO select(String curPage) {
        System.out.println(curPage);
        SqlSession session = MySqlSessionFactory.getSession();
        PageDTO pdto = null;
        try {
            pdto = dao.select(session, curPage);
        } finally {
            session.close();
        }

        return pdto;
    } // end select

    public int insert(EmpDTO dto) {
        int num = 0;
        SqlSession session = MySqlSessionFactory.getSession();
        try {
            num = dao.insert(session, dto);
            session.commit();
        } finally {
            session.close();
        }
        return num;
    }

    public EmpDTO selectByEmpno(int empno) {
        EmpDTO dto = null;
        SqlSession session = MySqlSessionFactory.getSession();
        try {
            dto = dao.selectByEmpno(session, empno);
        } finally {
            session.close();
        }
        return dto;
    }

    public int updateByEmpno(EmpDTO dto) {
        SqlSession session = MySqlSessionFactory.getSession();
        int num = 0;
        try {
            num = dao.updateByEmpno(session, dto);
            session.commit();
        } finally {
            session.close();
        }
        return num;
    }

    public int deleteByEmpno(int empno) {
        int num = 0;
        SqlSession session = MySqlSessionFactory.getSession();
        try {
            num = dao.deleteByEmpno(session, empno);
            session.commit();
        } finally {
            session.close();
        }
        return num;
    }

    public List<EmpDTO> searchByNames(String searchName, String searchValue) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("searchName", searchName);
        map.put("searchValue", searchValue);

        List<EmpDTO> list = null;
        SqlSession session = MySqlSessionFactory.getSession();
        try {
            list = dao.searchByNames(session, map);
        } finally {
            session.close();
        }
        return list;
    }

    public List<EmpDTO> searchBySal(String order) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("order", order);
        List<EmpDTO> list = null;
        SqlSession session = MySqlSessionFactory.getSession();
        try {
            list = dao.searchBySal(session, map);
        } finally {
            session.close();
        }
        return list;
    }
}
