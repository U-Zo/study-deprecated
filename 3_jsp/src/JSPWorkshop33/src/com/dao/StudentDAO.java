package com.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.PageDTO;
import com.dto.StudentDTO;

public class StudentDAO {

    public int totalCount(SqlSession session) {
        return session.selectOne("totalCount");
    }

    public PageDTO selectAllPageStudent(SqlSession session, int curPage) {
        PageDTO pDTO = new PageDTO();
        int perPage = 3; // 페이지 당 3개
        int offset = (curPage - 1) * perPage; // db에서 읽어올 부분의 시작 번호
        List<StudentDTO> list = session.selectList("selectAllStudent", null, new RowBounds(offset, perPage));
        pDTO.setPerPage(perPage); // 페이지 당 목록 수
        pDTO.setCurPage(curPage); // 현재 페이지 번호
        pDTO.setList(list); // 보여질 목록
        pDTO.setTotalCount(totalCount(session)); // 전체 목록 수

        return pDTO;
    }

}
