package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.GoodsDAO;
import com.dto.GoodsDTO;

public class GoodsService {
    private GoodsDAO dao;
    
    public GoodsService() {
        dao = new GoodsDAO();
    }

    /**
     * 
     * @param gCategory - 검색할 상품 목록의 카테고리
     * @return GoodsDTO 엔티티들이 담긴 List 객체
     */
    public List<GoodsDTO> goodsList(String gCategory) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        List<GoodsDTO> list = null;
        try {
            list = dao.goodsList(session, gCategory);
        } finally {
            session.close();
        }
        
        return list;
    } // end idCheck
} // end class
