package com.dao;

import com.dto.GoodsDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
