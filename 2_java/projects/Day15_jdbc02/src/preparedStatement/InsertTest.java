package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertTest {
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
            String sql = "insert into dept (deptno, dname, loc) " +
                    "values(?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 12);
            pstmt.setString(2, "개발");
            pstmt.setString(3, "서울");

//            int num = pstmt.executeUpdate();
//            System.out.println("실행된 레코드 수: " + num);
//            System.out.println();

            String sql2 = "select * from dept";
            pstmt = conn.prepareStatement(sql2);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int deptno = rs.getInt(1);
                String dname = rs.getString(2);
                String loc = rs.getString(3);
                System.out.println(deptno + "\t" + dname + "\t" + loc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
