package com.dao;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

public class OracleMybatisDAO {
    public HashMap<String, String> selectByDeptNoHashMap(SqlSession session, int deptno) throws RecordNotFoundException {
        HashMap<String, String> map = null;
        map = session.selectOne("selectByDeptNoHashMap", deptno);
        if (map == null) {
            throw new RecordNotFoundException("검색한 데이터가 없습니다.");
        }

        return map;
    }

    public List<Dept> selectByDeptNoIn(SqlSession session, HashMap<String, Integer> map) throws RecordNotFoundException {
        List<Dept> list = null;
        list = session.selectList("selectByDeptNoIn", map);
        if (list == null) {
            throw new RecordNotFoundException("검색한 데이터가 없습니다.");
        }

        return list;
    }

    public List<Dept> selectByHashMap(SqlSession session, HashMap<String, Integer> map) throws RecordNotFoundException {
        List<Dept> list = null;
        list = session.selectList("selectByHashMap", map);
        if (list == null) {
            throw new RecordNotFoundException("검색한 데이터가 없습니다.");
        }

        return list;
    }

    public List<Dept> selectByDeptNameAndLoc(SqlSession session, Dept dept) throws RecordNotFoundException {
        String dname = dept.getDname();
        String loc = dept.getLoc();
        List<Dept> list = null;

        if (dname == null && loc != null) {
            list = session.selectList("com.dept.DeptMapper.selectByLoc", loc.toUpperCase());
        } else if (loc == null && dname != null) {
            list = session.selectList("com.dept.DeptMapper.selectByDname", dname.toUpperCase());
        } else if (loc != null) {
            list = session.selectList("com.dept.DeptMapper.selectByDeptNameAndLoc", dept);
        }

        if (list == null) {
            throw new RecordNotFoundException("검색한 데이터가 없습니다.");
        }

        return list;
    }

    public int deptRecordCount(SqlSession session) {
        return session.selectOne("com.dept.DeptMapper.selectRecordCount");
    }

    public List<Dept> selectAll(SqlSession session) {
        // select(id, parameter) -> parameter 는 Mapper.xml 에서 얻어옴
        // selectList 메서드에 수행할 sql 문, 즉 DeptMapper.xml 에 정의 된 sql 문의 id 지정
        // session 정보를 사용하여 selectList 메서드를 수행
        // selectList(): 결과의 모든 행을 resultType 으로 변환 후 list 에 추가함
        List<Dept> list = session.selectList("com.dept.DeptMapper.selectAll");

        return list;
    }

    public Dept selectByDeptno(SqlSession session, int deptno) {
        Dept dept = null;
        dept = session.selectOne("com.dept.DeptMapper.selectByDeptno", deptno);

        return dept;
    }

    public void insert(SqlSession session, Dept dept) {
        int n = session.insert("com.dept.DeptMapper2.insertDept", dept);
        System.out.println("추가된 레코드: " + n);
    }

    public void update(SqlSession session, Dept dept) throws RecordNotFoundException {
        int n = session.update("com.dept.DeptMapper2.updateDept", dept);
        if (n == 0) {
            throw new RecordNotFoundException("수정할 데이터가 없습니다.");
        }
        System.out.println("수정된 레코드: " + n);
    }

    public void delete(SqlSession session, int deptno) {
        int n = session.delete("com.dept.DeptMapper2.deleteDept", deptno);
        System.out.println("삭제된 레코드: " + n);
    }
}
