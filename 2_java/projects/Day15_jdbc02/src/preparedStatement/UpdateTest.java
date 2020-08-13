package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateTest {
    public static void main(String[] args) throws Exception {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "scott";
        String password = "tiger";

        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, password);

        // 1 =================================================================
        System.out.println("1.");
        String dname = "영업";
        String loc = "제주";
        int deptno = 90;
        String sql = "update dept " +
                "set dname = ?, loc = ? " +
                "where deptno = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, dname);
        pstmt.setString(2, loc);
        pstmt.setInt(3, deptno);
        // pstmt.executeUpdate();

        String sql2 = "select * from dept where deptno = ?";
        pstmt = conn.prepareStatement(sql2);
        pstmt.setInt(1, deptno);

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            deptno = rs.getInt(1);
            dname = rs.getString(2);
            loc = rs.getString(3);

            System.out.println(deptno + "\t" + dname + "\t" + loc);
        }

        // 2 =================================================================
        System.out.println();
        System.out.println("2.");
        String sql3 = "select deptno from dept " +
                "where dname in (?, ?)";
        pstmt = conn.prepareStatement(sql3);
        pstmt.setString(1, "개발");
        pstmt.setString(2, "영업");
        rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1));
        }

        // 3 =================================================================
        System.out.println();
        System.out.println("3.");
        String sql4 = "select deptno from dept " +
                "order by deptno";
        pstmt = conn.prepareStatement(sql4);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1));
        }

        // 4 =================================================================
        System.out.println();
        System.out.println("4. 10 <= deptno <= 30");
        String sql5 = "select deptno from dept " +
                "where deptno between ? and ?";
        pstmt = conn.prepareStatement(sql5);
        pstmt.setInt(1, 10);
        pstmt.setInt(2, 30);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1));
        }

        // 5 =================================================================
        System.out.println();
        System.out.println("5. count records");
        String sql6 = "select count(*) from dept";
        pstmt = conn.prepareStatement(sql6);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1));
        }

        // 6 =================================================================
        System.out.println();
        System.out.println("6. print loc in dept >= 20");
        String sql7 = "select loc from dept " +
                "where deptno >= ?";
        pstmt = conn.prepareStatement(sql7);
        pstmt.setInt(1, 20);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }

        // 7 =================================================================
        System.out.println();
        System.out.println("7. print dname, loc that name is started character A");
        String sql8 = "select dname, loc from dept " +
                "where dname like ?";
        pstmt = conn.prepareStatement(sql8);
        pstmt.setString(1, "A%");
        rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1) + "\t" + rs.getString(2));
        }

        // 8 =================================================================
        System.out.println();
        System.out.println("8. print highest deptno");
        String sql9 = "select dname from dept " +
                "where deptno = (" +
                "select max(deptno) from dept" +
                ")";
        pstmt = conn.prepareStatement(sql9);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }

        // 9 =================================================================
        System.out.println();
        System.out.println("9. update loc to 제주 after insert deptno 99, 개발, 서울");
        String sql10 = "insert into dept(deptno, dname, loc) " +
                "values(?, ?, ?)";
        pstmt = conn.prepareStatement(sql10);
        pstmt.setInt(1, 99);
        pstmt.setString(2, "개발");
        pstmt.setString(3, "서울");
        // pstmt.executeUpdate();

        sql10 = "update dept set loc = ? where deptno = ?";
        pstmt = conn.prepareStatement(sql10);
        pstmt.setString(1, "제주");
        pstmt.setInt(2, 99);
        pstmt.executeUpdate();

        sql10 = "select deptno, loc " +
                "from dept " +
                "where deptno = ?";
        pstmt = conn.prepareStatement(sql10);
        pstmt.setInt(1, 99);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        rs.close();
        pstmt.close();
        conn.close();
    }
}
