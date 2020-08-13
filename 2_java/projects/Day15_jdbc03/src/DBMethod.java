import dao.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBMethod {
    private String url;
    private String user;
    private String password;
    private String sql;
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
    private Dao dao;

    public DBMethod() {
        url = "jdbc:oracle:thin:@localhost:1521:orcl";
        user = "scott";
        password = "tiger";
        dao = dao.getDao();
    }

    public String getDeptAdata(int deptno) {
        String result = "";

        try {
            conn = dao.getConn(url, user, password);
            sql = "select * from dept where deptno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, deptno);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int dno = rs.getInt("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                result += dno + "\t" + dname + "\t" + loc + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return result;
    }

    public int delAdata(int deptno) {
        int num = 0;
        try {
            conn = dao.getConn(url, user, password);
            sql = "delete from dept where deptno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, deptno);
            num = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return num;
    }

    public void close() {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
