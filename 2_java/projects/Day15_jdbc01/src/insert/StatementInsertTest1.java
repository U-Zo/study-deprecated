package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementInsertTest1 {
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
            int deptno = 13;
            String deptname = "개발";
            String loc = "서울";
            String sql = "insert into dept(deptno, dname, loc)" +
                    "values(" + deptno + ", '" + deptname + "', '" + loc + "')";
            stmt.executeUpdate(sql);

            sql = "select deptno, dname, loc " +
                    "from dept " +
                    "where dname = '" + deptname + "'";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" +
                        rs.getString(2) + "\t" +
                        rs.getString(3));
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
