package com.service;

import com.dao.DeptDAO;
import com.dto.DeptDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeptService {

    private final DeptDAO dao;

    public List<DeptDTO> findAll() {
        return dao.findAll();
    }
}
