package com.service;

import com.dao.GoodsDAO;
import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    public List<CartDTO> cartList(String userid) {
        return dao.cartList(userid);
    }

    public void cartUpdate(Map<String, String> map) {
        dao.cartUpdate(map);
    }

    public void cartDel(int num) {
        dao.cartDel(num);
    }

    public void cartAllDel(List<String> list) {
        dao.cartAllDel(list);
    }
    
    public CartDTO orderConfirmByNum(int num) {
    	return dao.orderConfirmByNum(num);
    }

    public void orderDone(Map<String, String> map) {
        dao.orderDone(map);
    }
}
