package com.service;

import com.dao.DeptDAO;

public class DeptService {
    private DeptDAO dao;

    public DeptService() {
    }

    public DeptService(DeptDAO dao) {
        this.dao = dao;
    }

    public void setDao(DeptDAO dao) {
        this.dao = dao;
    }

    public DeptDAO getDao() {
        return dao;
    }
}
