package com.service;

import com.dao.GoodsDAO;
import com.dto.CartDTO;
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
        return dao.goodsList(gCategory);
    }

    public GoodsDTO goodsRetrieve(String gCode) {
        return dao.goodsRetrieve(gCode);
    }

    public void cartAdd(CartDTO dto) {
        dao.cartAdd(dto);
    }
}
