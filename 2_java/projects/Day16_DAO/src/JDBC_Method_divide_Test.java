import java.sql.*;
import java.util.ArrayList;

public class JDBC_Method_divide_Test {
    private final String driver = "oracle.jdbc.driver.OracleDriver";
    private final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    private final String user = "scott";
    private final String password = "tiger";
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;

    public JDBC_Method_divide_Test() {
        //드라이버 로딩
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<DeptDTO> search(String loc, String name) {
        //지역만 넘어온 경우 지역만 검색 결과 리턴
        //이름만 넘어온 경우 이름만 검색 결과 리턴
        //이름, 지역이 넘어온 경우 두 가지를 이용 검색 결과 리턴
        getConn();
        ArrayList<DeptDTO> list = new ArrayList<>();
        String sql;
        String data; // 데이터가 들어오는 거에 따라 if 문에서 분별하려고 했음
        String data2 = null; // 데이터가 2개 들어올 때 사용하려고 했음
        try {
            if (name == null) { // loc 만 들어왔을 때
                sql = "select * from dept where loc = ?";
                data = loc; // 물음표에 들어갈 loc 값을 data 에 저장
            } else if (loc == null) { // name 만 들어왔을 때
                sql = "select * from dept where dname = ?";
                data = name; // 물음표에 들어갈 name 값을 data 에 저장
            } else {
                sql = "select * from dept where dname = ? and loc = ?";
                data = name; // 물음표에 들어갈 데이터들 저장
                data2 = loc;
            }

            pstmt = conn.prepareStatement(sql); // pstmt에 sql 문 장착!
            pstmt.setString(1, data); // ?에 data 변수의 값을 대입
            if (data2 != null) {
                pstmt.setString(2, data2);
            }

            setResult(list);
            if (list.isEmpty()) {
                throw new RecordNotFoundException("찾는 데이터가 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (RecordNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            close();
        }

        return list;
    }

    public ArrayList<DeptDTO> getAllDept() {
        //부서전체 select
        //결과를 메인으로 리턴 메인에서 전체 데이터 출력
        getConn();
        ArrayList<DeptDTO> result = new ArrayList<>();
        String sql = "select * from dept";
        try {
            pstmt = conn.prepareStatement(sql);
            setResult(result);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return result;
    }

    public DeptDTO searchDeptByLoc(String loc) {
        //주소로 select
        //검색한 내용을 ? 로 리턴 메인에서 전체 데이터 출력
        getConn();
        String sql = "select * from dept where loc = ?";
        return getStringQuery(sql, loc);
    }

    public DeptDTO searchDeptByName(String dname) {
        //부서이름으로로 select
        //검색한 내용을 ? 로 리턴 메인에서 전체 데이터 출력
        getConn();
        String sql = "select * from dept where dname = ?";
        return getStringQuery(sql, dname);
    }

    public int updateDept(DeptDTO deptDTO) {
        //부서번호로 dname, loc업데이트 후
        //업데이트 결과 갯수 리턴
        getConn();
        int result = 0;
        String sql = "update dept set dname = ?, loc = ? " +
                "where deptno = ?";
        result = getIntQuery(sql, deptDTO.getDname(), deptDTO.getLoc(), deptDTO.getDeptno());

        return result;
    }

    public int insertDept(DeptDTO deptDTO) {
        //부서하나 추가후
        //insert 결과 갯수 리턴
        getConn();
        int result = 0;
        String sql = "insert into dept(dname, loc, deptno) " +
                "values(?, ?, ?)";
        result = getIntQuery(sql, deptDTO.getDname(), deptDTO.getLoc(), deptDTO.getDeptno());

        return result;
    }

    public DeptDTO getDeptData(int deptno) {
        //부서번호로 select
        //검색 결과가 없을 경우 사용자 정의 Exception 발생(RecordNotFoundException-메세지
        //찾는 부서 번호가 없습니다.
        //검색한 내용을 문자열로 리턴
        getConn();
        DeptDTO result = null;
        String sql = "select * from dept where deptno = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, deptno);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String dname = rs.getString(2);
                String loc = rs.getString(3);
                result = new DeptDTO(deptno, dname, loc);
            }

            if (result == null) {
                throw new RecordNotFoundException("찾는 부서가 없습니다.");
            }
        } catch (SQLException | RecordNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            close();
        }

        return result;
    }

    public DeptDTO getStringQuery(String sql, String data) {
        DeptDTO deptDTO = null;

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, data);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int deptno = rs.getInt(1);
                String dname = rs.getString(2);
                String loc = rs.getString(3);
                deptDTO = new DeptDTO(deptno, dname, loc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return deptDTO;
    }

    public int getIntQuery(String sql, String dname, String loc, int deptno) {
        int num = 0;

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dname);
            pstmt.setString(2, loc);
            pstmt.setInt(3, deptno);
            num = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return num;
    }

    public void setResult(ArrayList<DeptDTO> list) throws SQLException {
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int deptno = rs.getInt(1);
            String dname = rs.getString(2);
            String loc = rs.getString(3);

            list.add(new DeptDTO(deptno, dname, loc));
        }
    }

    public void getConn() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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

    public static void main(String[] args) {
        JDBC_Method_divide_Test test = new JDBC_Method_divide_Test();

        ArrayList<DeptDTO> list = test.getAllDept();
        for (DeptDTO d : list) {
            System.out.println(d.getDname());
        }

        System.out.println(test.getDeptData(10));
    }
}
