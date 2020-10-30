package com.service;

import com.dao.DeptDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DeptService {
    private DeptDAO dao;

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.userid}")
    private String userid;

    @Value("${jdbc.passwd}")
    private String passwd;

    public DeptDAO getDao() {
        return dao;
    }

    @Autowired
    public void setDao(DeptDAO dao) {
        this.dao = dao;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "DeptService{" +
                ", driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", userid='" + userid + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
