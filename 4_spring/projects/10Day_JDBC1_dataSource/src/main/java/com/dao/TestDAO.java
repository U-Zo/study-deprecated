package com.dao;

import com.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository
public class TestDAO {
    @Autowired
    DataSource dataSource;

    public ArrayList<TestDTO> select(){
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        ArrayList<TestDTO> list=new ArrayList<TestDTO>();
        try{
            con=dataSource.getConnection();
            String sql="select * from test";
            pstmt=con.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while (rs.next()){
                int n=rs.getInt("num");
                String n2=rs.getString("username");
                String n3=rs.getString("address");
                TestDTO dto=new TestDTO(n,n2,n3);
                list.add(dto);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(rs!=null)rs.close();
                if(pstmt!=null)pstmt.close();
                if(con!=null)con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }return list;
    }

}
