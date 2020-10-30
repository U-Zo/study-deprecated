import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 데이터베이스 접근 클래스
 */
public class TestDAO {

    private final String driver = "oracle.jdbc.driver.OracleDriver";
    private final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    private final String userid = "scott";
    private final String passwd = "tiger";

    public TestDAO() {

        // 드라이버 로딩
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<TestDTO> select() {
        ArrayList<TestDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, userid, passwd);
            String sql = "select * from test";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int n = rs.getInt("num");
                String n2 = rs.getString("username");
                String n3 = rs.getString("address");
                TestDTO dto = new TestDTO(n, n2, n3);
                list.add(dto);
            }
        } catch (SQLException e) {
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

        return list;
    }

    public TestDTO selectByUsername(String username) {
        TestDTO dto = null;

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, userid, passwd);
            String sql = "select * from test where username = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int n = rs.getInt("num");
                String n2 = rs.getString("username");
                String n3 = rs.getString("address");
                dto = new TestDTO(n, n2, n3);
            }
        } catch (SQLException e) {
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

        return dto;
    }

    public void insert(int num, String username, String address) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, userid, passwd);
            String sql = "insert into test values(?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, num);
            pstmt.setString(2, username);
            pstmt.setString(3, address);
            pstmt.executeUpdate();
        } catch (SQLException e) {
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
