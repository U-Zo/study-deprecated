package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.StdDTO;

public class StdDAO {
    public List<StdDTO> selectAllStd(SqlSession session) {
        List<StdDTO> list = null;
        list = session.selectList("std.selectAllStd");

        return list;
    }
}
