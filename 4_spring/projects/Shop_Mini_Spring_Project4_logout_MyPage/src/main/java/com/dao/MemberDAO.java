package com.dao;

import com.dto.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class MemberDAO {

    private final SqlSessionTemplate template;

    public MemberDAO(SqlSessionTemplate template) {
        this.template = template;
    }

    public void memberAdd(MemberDTO m) {
        template.insert("MemberMapper.memberAdd", m);
    }

    public MemberDTO login(Map<String, String> map) {
        return template.selectOne("MemberMapper.login", map);
    }

    public MemberDTO myPage(String userid) {
        return template.selectOne("MemberMapper.myPage", userid);
    }
}
