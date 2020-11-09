package com.dao;

import com.dto.TestDTO;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class TestDAO {
    private final JdbcTemplate jdbcTemplate;//pom.xml에 dependency 추가 설정

    public TestDAO(DataSource dataSource) {//DataSource는 생성자를 통해서 주입받을 것
        jdbcTemplate = new JdbcTemplate(dataSource); //DataSource를 통해서 주입
    }

    public List<TestDTO> select() {
        List<TestDTO> list = jdbcTemplate.query("select * from test",
                (rs, i) -> {
                    TestDTO dto = new TestDTO();
                    dto.setNum(rs.getInt(1));
                    dto.setUsername(rs.getString(2));
                    dto.setAddress(rs.getString(3));
                    return dto;
                }
        );
        return list;
    }

    public List<TestDTO> selectByName(String name) {
        List<TestDTO> list = jdbcTemplate.query("select * from test where username=?", (rs, i) -> {
            TestDTO dto = new TestDTO();
            dto.setNum(rs.getInt(1));
            dto.setUsername(rs.getString(2));
            dto.setAddress(rs.getString(3));
            return dto;
        }, name);
        return list;
    }

    public int insert(int num, String username, String address) {
        int result = jdbcTemplate.update("insert into test(num,username,address) values (?,?,?)", num, username, address);
        return result;
    }


}
