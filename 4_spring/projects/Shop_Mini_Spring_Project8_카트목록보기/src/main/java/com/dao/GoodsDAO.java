package com.dao;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class GoodsDAO {

    private final SqlSessionTemplate template;//자동주입,sqlsession 과 동일

    public GoodsDAO(SqlSessionTemplate template) {
        this.template = template;
    }

    public List<GoodsDTO> goodsList(String gCategory) {
        List<GoodsDTO> list = template.selectList("GoodsMapper.goodsList", gCategory);
        return list;
    }

    public GoodsDTO goodsRetrieve(String gCode) {
        return template.selectOne("GoodsMapper.goodsRetrieve", gCode);
    }

    public void cartAdd(CartDTO dto) {
        template.insert("CartMapper.cartAdd", dto);
    }

    public List<CartDTO> cartList(String userid) {
        return template.selectList("CartMapper.cartList", userid);
    }

    public void cartUpdate(Map<String, String> map) {
        template.update("CartMapper.cartUpdate", map);
    }

    public void cartDel(int num) {
        template.delete("CartMapper.cartDel", num);
    }

    public void cartAllDel(List<String> list) {
        template.delete("CartMapper.cartAllDel", list);
    }
}
