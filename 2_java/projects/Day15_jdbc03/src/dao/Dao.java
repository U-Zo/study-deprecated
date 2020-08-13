package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
    private static Dao dao = new Dao();
    private static Connection conn = null;

    private Dao() {
        String driver = "oracle.jdbc.driver.OracleDriver";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Dao getDao() {
        return dao;
    }

    public Connection getConn(String url, String user, String password) throws Exception {
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(url, user, password);
        }

        return conn;
    }
}
