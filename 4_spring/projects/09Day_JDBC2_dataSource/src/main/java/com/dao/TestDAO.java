package com.dao;

import com.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository
public class TestDAO {
    //DataSource datasource; - 드라이버 4가지 정보 저장된 datasource를 자동 주입 설정
    //con=dataSource.getConnection(); - 드라이버 로딩
    //개발자는 connection을 매번 맺는 번거로움을 줄일 수 있다. => con=dataSource.getConnection();
    @Autowired
    DataSource dataSource;

    public ArrayList<TestDTO> select(){
        ArrayList<TestDTO> list=new ArrayList<TestDTO>();
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try{
            con=dataSource.getConnection();
            String sql="select * from test";
            pstmt=con.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while(rs.next()){
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
                if(pstmt!=null)rs.close();
                if(con!=null)con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }return list;
    }
    public int insert(int num,String username,String address){
        int result=0;
        Connection con=null;
        PreparedStatement pstmt=null;

        try{
            con=dataSource.getConnection();
            String sql="insert into test(num,username,address)"
                    + "values(?,?,?)";
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1,num);
            pstmt.setString(2,username);
            pstmt.setString(3,address);
            result=pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(pstmt!=null)pstmt.close();
                if(con!=null)con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return result;

    }
}
