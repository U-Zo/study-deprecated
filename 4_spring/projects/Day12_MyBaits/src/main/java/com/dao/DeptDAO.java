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
}
