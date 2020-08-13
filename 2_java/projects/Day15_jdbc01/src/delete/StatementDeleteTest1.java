package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementDeleteTest1 {
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
            // insert
            int deptno = 90;
            String dname = "개발";
            String loc = "서울";
            String sql = "insert into dept(deptno, dname, loc) " +
                    "values(" + deptno + ", '" + dname + "', '" + loc + "')";
            // stmt.executeUpdate(sql);

            dname = "영업";
            loc = "제주";
            sql = "update dept " +
                    "set dname = '" + dname + "', loc = '" + loc + "' " +
                    "where deptno = " + deptno;
            stmt.executeUpdate(sql);

            sql = "select * from dept";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                deptno = rs.getInt("deptno");
                dname = rs.getString("dname");
                loc = rs.getString("loc");
                System.out.println(deptno + "\t" + dname + "\t" + loc);
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
