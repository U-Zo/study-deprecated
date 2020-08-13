package select;

import java.sql.*;

public class StatementTest {
    public static void main(String[] args) {
        // 1. 접속에 필요한 4가지 정보 저장
        String driver = "oracle.jdbc.driver.OracleDriver"; // 접속 api 클래스
        String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // 접속 주소
        String user = "scott"; // 사용자 이름
        String password = "tiger"; // 사용자 비밀번호

        // 2. 드라이버 생성
        Connection con = null; // DB 접속 정보를 저장할 객체
        // PreparedStatement pstmt = null;
        Statement stmt = null; // SQL 쿼리를 실행할 객체
        ResultSet rs = null; // SQL 쿼리 결과를 저장할 객체

        // 3. 오라클 연결 (Connection 연결)
        try {
            Class.forName(driver); // 드라이버 로딩
            con = DriverManager.getConnection(url, user, password); // DB 접속 정보 저장
            System.out.println("접속 성공");

            // 4. SQL 쿼리 요청 준비
            String sql = "SELECT DEPTNO x, DNAME, LOC FROM DEPT"; // 사용할 쿼리문
            stmt = con.createStatement(); // DB에 요청할 sql 쿼리 객체 생성

            // 5. SQL 쿼리 요청 수행
            rs = stmt.executeQuery(sql); // stmt를 사용하여 쿼리 요청, ResultSet 객체에 쿼리 결과 저장

            // 6. SQL 쿼리 결과 저장
            // 쿼리 결과를 저장한 객체의 데이터 조회
            while (rs.next()) { // 쿼리 결과 데이터의 행이 있으면 true 리턴 및 rs에 저장, 없으면 false 리턴
                int deptno = rs.getInt(1); // 저장한 데이터의 DEPTNO 컬럼 조회
                String dname = rs.getString(2); // 저장한 데이터의 DNAME 컬럼 조회
                String loc = rs.getString(3); // 저장한 데이터의 LOC 컬럼 조회
                System.out.println(deptno + "\t" + dname + "\t" + loc); // 출력
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 7. SQL 객체 자원 반환
            try {
                // 객체 자원 반환할 때는 객체 생성의 역순으로 반환해야 함
                // 객체를 close 메서드를 사용해서 반환하지 않으면 메모리 누수 발생
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
