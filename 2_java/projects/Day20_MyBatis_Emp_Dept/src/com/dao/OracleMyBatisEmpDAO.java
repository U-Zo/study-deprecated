package com.dao;

import com.dto.Emp;
import com.exception.RecordNotFoundException;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class OracleMyBatisEmpDAO {
    public List<Emp> selectAll(SqlSession session) {
        List<Emp> list = null;
        list = session.selectList("com.emp.EmpMapper.selectAll");

        return list;
    }

    public Emp selectByEmpno(SqlSession session, int empno) throws RecordNotFoundException {
        Emp emp = null;
        emp = session.selectOne("com.emp.EmpMapper.selectByEmpno", empno);
        if (emp == null) throw new RecordNotFoundException("검색할 데이터가 없습니다.");

        return emp;
    }

    public void insert(SqlSession session, Emp emp) {
        int num = 0;
        num = session.insert("com.emp.EmpMapper2.insert", emp);
        System.out.println("삽입된 행: " + num);
    }

    public void update(SqlSession session, Emp emp) throws RecordNotFoundException {
        int num = 0;
        num = session.insert("com.emp.EmpMapper2.update", emp);
        if (num == 0) throw new RecordNotFoundException("수정할 데이터가 없습니다.");

        System.out.println("수정된 행: " + num);
    }

    public void delete(SqlSession session, int empno) throws RecordNotFoundException {
        int num = 0;
        num = session.insert("com.emp.EmpMapper2.delete", empno);
        if (num == 0) throw new RecordNotFoundException("삭제할 데이터가 없습니다.");

        System.out.println("삭제된 행: " + num);
    }
}
