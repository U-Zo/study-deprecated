package com.service;

import com.dao.ProductDAO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;

import java.util.List;

public class ProductService {

    ProductDAO dao;

    //setter로 주입받음
    public void setDao(ProductDAO dao) {
        this.dao = dao;
    }

    public List<ProductDTO> selectProduct() {
        return dao.selectProduct();
    }

    public List<OrderDTO> selectOrder() {
        return dao.selectOrder();
    }

    public void addOrder(String pcode, int quantity) throws Exception {
        dao.addOrder(pcode, quantity);
    }
}
