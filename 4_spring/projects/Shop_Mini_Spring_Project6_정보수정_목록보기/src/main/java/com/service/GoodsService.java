package com.service;

import com.dao.GoodsDAO;
import com.dto.GoodsDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    private final GoodsDAO dao;

    public GoodsService(GoodsDAO dao) {
        this.dao = dao;
    }

    public List<GoodsDTO> goodsList(String gCategory) {
        List<GoodsDTO> list = dao.goodsList(gCategory);
        return list;
    }
}
