import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String DRIVER = "oracle.jdbc.driver.OracleDriver";
        final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
        final String USER = "test";
        final String PASSWORD = "test";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("매출 조회 메뉴 - [ 매출 일자순: 1, 상품별 매출순: 2, 종료: any number ]: ");
            int num = sc.nextInt();
            try {
                Class.forName(DRIVER);
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                String sql = null;
                if (num == 1) {
                    sql = "select to_char(odate, 'yyyy-mm-dd') 영업일, sum(quantity * price) 매출액 " +
                            "from d7_order " +
                            "join d7_product " +
                            "using (pid) " +
                            "group by odate " +
                            "order by odate";
                } else if (num == 2) {
                    sql = "select pname 상품명, sum(quantity * price) 매출액 " +
                            "from d7_order " +
                            "join d7_product " +
                            "using (pid) " +
                            "group by pname " +
                            "order by 매출액 desc";
                } else {
                    try {
                        if (rs != null) rs.close();
                        if (pstmt != null) pstmt.close();
                        if (conn != null) conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    return;
                }

                pstmt = conn.prepareStatement(sql);
                rs = pstmt.executeQuery();

                System.out.println("----------------------------");
                System.out.println(num == 1 ? "영업일" : "상품명" + "\t\t\t매출");
                System.out.println("----------------------------");
                while (rs.next()) {
                    String col1 = rs.getString(1);
                    int price = rs.getInt(2);
                    System.out.println(col1 + "\t\t" + price);
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
}