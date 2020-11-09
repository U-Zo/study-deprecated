package com.dao;

import com.dto.DeptDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DeptDAO {

    private final SqlSessionTemplate template;

    public List<DeptDTO> findAll() {
        return template.selectList("DeptMapper.findAll");
    }

    public void tx() throws Exception {
        template.delete("DeptMapper.deleteDept", 50);
        DeptDTO dto = new DeptDTO(60, "6666", "6666");
        template.insert("DeptMapper.insertDept", dto);
    }
}
