package select;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver"; // 접속 api 클래스
        String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // 접속 주소
        String user = "scott"; // 사용자 이름
        String password = "tiger"; // 사용자 비밀번호

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("DB 접속 성공");

            String sql = "select empno, ename from emp";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                System.out.println(empno + "\t" + ename);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
