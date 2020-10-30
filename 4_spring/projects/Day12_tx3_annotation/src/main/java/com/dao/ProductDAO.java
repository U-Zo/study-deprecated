package com.dao;

import com.entity.OrderDTO;
import com.entity.ProductDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ProductDTO> selectProduct() {
        String query = "select * from t_product order by pcode";
        return jdbcTemplate.query(query, new RowMapper<ProductDTO>() {
            public ProductDTO mapRow(ResultSet rs, int i) throws SQLException {
                ProductDTO dto = new ProductDTO();
                dto.setPcode(rs.getString("pcode"));
                dto.setPname(rs.getString("pname"));
                dto.setPrice(rs.getInt("price"));
                dto.setQuantity(rs.getInt("quantity"));
                return dto;
            }
        });
    }

    public List<OrderDTO> selectOrder() {
        String query = "select * from t_order order by pcode";
        return jdbcTemplate.query(query, new RowMapper<OrderDTO>() {
            public OrderDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                OrderDTO dto = new OrderDTO();
                dto.setNum(rs.getInt("num"));
                dto.setPcode(rs.getString("pcode"));
                dto.setQuantity(rs.getInt("quantity"));
                return dto;
            }
        });
    }

    public void addOrder(String pcode, int quantity) throws Exception {
        String sql1 = "update t_product set quantity = quantity - ? where pcode = ?";

        int n = jdbcTemplate.update(sql1, quantity, pcode);
        System.out.println("update t_product ============= " + n);

        String sql2 = "in into t_order (num, pcode, quantity) values (t_order_seq.nextval, ?, ?)";

        // SQL 문 틀림
        int n2 = jdbcTemplate.update(sql2, pcode, quantity);
        System.out.println("insert t_order ==================== " + n);
    }
}
