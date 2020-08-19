package com.dao;

import com.dto.Dept;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OracleMybatisDAO {
    public List<Dept> selectAll(SqlSession session) {
        // select(id, parameter) -> parameter 는 Mapper.xml 에서 얻어옴
        // selectList 메서드에 수행할 sql 문, 즉 DeptMapper.xml 에 정의 된 sql 문의 id 지정
        // session 정보를 사용하여 selectList 메서드를 수행
        // selectList(): 결과의 모든 행을 resultType 으로 변환 후 list 에 추가함
        List<Dept> list = session.selectList("selectAll");

        return list;
    }

    public Dept selectByDeptno(SqlSession session, int deptno) {
        Dept dept = null;
        dept = session.selectOne("selectByDeptno", deptno);

        return dept;
    }

    public void insert(SqlSession session, Dept dept) {
        int n = session.insert("insertDept", dept);
        System.out.println("추가된 레코드: " + n);
    }

    public void delete(SqlSession session, int deptno) {
        int n = session.delete("deleteDept", deptno);
        System.out.println("삭제된 레코드: " + n);
    }
}
