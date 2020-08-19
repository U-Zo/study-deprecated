package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
    static SqlSessionFactory sqlSessionFactory = null;

    static {
        // Configuration.xml 에 4가지 db 연결 정보 설정해놓고
        String resource = "Configuration.xml"; // 경로를 String 타입으로 저장
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 데이터베이스 연결 정보 Connection 을 얻어갈 수 있는 클래스
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    } // end static

    // SqlSession 반환해주는 메서드
    // MySqlSessionFactory.getSession()
    public static SqlSession getSession() { // getConnection() 메서드와 비슷함
        // SqlSession: Connection 과 비슷한 역할
        SqlSession session = sqlSessionFactory.openSession();

        return session;
    }

} // end class
