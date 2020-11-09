import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;

public class TestDAO {

    String driver="oracle.jdbc.driver.OracleDriver";
    String url="jdbc:oracle:thin:@localhost:1521:orcl";
    String userid="test1";
    String passwd="test1";


    public TestDAO(){
        try{
            Class.forName(driver);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public int insert(int num,String username,String address){
        Connection con=null;
        PreparedStatement pstmt1=null;
        PreparedStatement pstmt2=null;
        int result=0;
        try{
            con= DriverManager.getConnection(url,userid,passwd);
            String sql="insert into test(num,username,address)"
                    +"values (?,?,?)";
            String sql2="insert into test(num,username,address)"
                    +"value(?,?,?)";
            pstmt1=con.prepareStatement(sql);
            pstmt2=con.prepareStatement(sql2);
            pstmt1.setInt(1,num);
            pstmt1.setString(2,username);
            pstmt1.setString(3,address);
            pstmt2.setInt(1,num);
            pstmt2.setString(2,username);
            pstmt2.setString(3,address);

            con.setAutoCommit(false);

            result=pstmt1.executeUpdate();
            if(result==1)con.setAutoCommit(true);
        }catch (Exception e){
            try{
                System.out.println("rollback됨");
                con.rollback();
            }catch (SQLException e1){
                e1.printStackTrace();
            }
        }finally {
            try{
                if(pstmt1!=null)pstmt1.close();
                if(con!=null)con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }

        }
        return result;
    }
}
