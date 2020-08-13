package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementInsertTest2 {
    public static void main(String[] args) {
        // DB 접속에 필요한 정보
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "scott";
        String password = "tiger";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();

            int deptno = 80;
            String dname = "영업";
            String loc = "제주";
            String sql = "Update dept " +
                    "set dname = '" + dname + "', loc = '" + loc + "' " +
                    "where deptno = " + deptno;
            stmt.executeUpdate(sql);

            String sql2 = "select deptno, dname, loc " +
                    "from dept " +
                    "where deptno = " + deptno;
            rs = stmt.executeQuery(sql2);
            while (rs.next()) {
                int _deptno = rs.getInt("deptno");
                String _dname = rs.getString("dname");
                String _loc = rs.getString("loc");

                System.out.println(_deptno + "\t" + _dname + "\t" + _loc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
