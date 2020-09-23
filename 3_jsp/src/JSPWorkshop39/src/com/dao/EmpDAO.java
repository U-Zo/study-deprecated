package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;
import com.dto.PageDTO;

public class EmpDAO {

    public int totalCount(SqlSession session) {
        return session.selectOne("totalCount");
    }

    public PageDTO select(SqlSession session, String curPage) {
        PageDTO pdto = new PageDTO();
        int _curPage = Integer.parseInt(curPage);
        int perPage = pdto.getPerPage();
        int offset = (_curPage - 1) * perPage;
        
        System.out.println(pdto);
        System.out.println(offset);
        System.out.println(perPage);

        List<EmpDTO> list = session.selectList("selectAll", null, new RowBounds(offset, perPage));

        pdto.setCurPage(_curPage);
        pdto.setList(list);
        pdto.setTotalCount(totalCount(session));

        return pdto;
    }

    public int insert(SqlSession session, EmpDTO dto) {
        int num = session.insert("insertEmp", dto);
        return num;
    }

    public EmpDTO selectByEmpno(SqlSession session, int empno) {
        EmpDTO dto = session.selectOne("selectByEmpno", empno);
        return dto;
    }

    public int updateByEmpno(SqlSession session, EmpDTO dto) {
        int num = session.update("updateByEmpno", dto);
        return num;
    }

    public int deleteByEmpno(SqlSession session, int empno) {
        int num = session.delete("deleteByEmpno", empno);
        return num;
    }

    public List<EmpDTO> searchByNames(SqlSession session, HashMap<String, String> map) {
        List<EmpDTO> list = session.selectList("searchByNames", map);
        return list;

    }

    public List<EmpDTO> searchBySal(SqlSession session, HashMap<String, String> map) {
        List<EmpDTO> list = session.selectList("searchBySal", map);
        return list;
    }
}
