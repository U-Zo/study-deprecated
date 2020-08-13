package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DotJava {
    public static void main(String[] args) {
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
            String name = "SALES";
            String sql = "select deptno, dname, loc " +
                    "from dept " +
                    "where dname = '" + name + "'";
            rs = stmt.executeQuery(sql);
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
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
