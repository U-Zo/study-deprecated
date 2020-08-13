package preparedStatement;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "scott";
        String password = "tiger";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            String sql = "select deptno, dname, loc from dept where deptno = 12";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int deptno = rs.getInt(1);
                String dname = rs.getString(2);
                String loc = rs.getString(3);
                System.out.println(deptno + "\t" + dname + "\t" + loc);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
