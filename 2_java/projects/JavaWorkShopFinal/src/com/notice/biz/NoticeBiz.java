package com.notice.biz;

import com.config.MySqlSessionFactory;
import com.employee.exception.DataNotFoundException;
import com.notice.dao.NoticeDAO;
import com.notice.entity.Notice;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class NoticeBiz implements INoticeBiz {
    private NoticeDAO dao;

    public NoticeBiz() {
        dao = new NoticeDAO();
    }

    @Override
    public List<Notice> selectAllNotice() {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        List<Notice> list = null;
        try {
            list = dao.selectAllNotice(session);
        } finally {
            session.close();
        }

        return list;
    }

    @Override
    public Notice selectDetailNotice(String noticeNum) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        Notice notice = null;
        try {
            notice = dao.selectDetailNotice(session, noticeNum);
        } catch (DataNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }

        return notice;
    }

    @Override
    public void noticeUpdate(Notice notice) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        try {
            dao.noticeUpdate(session, notice);
            session.commit();
        } catch (DataNotFoundException e) {
            System.out.println(e.getMessage());
            session.rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void noticeDelete(String inputNum) {
        SqlSession session = MySqlSessionFactory.getSqlSession();
        try {
            dao.noticeDelete(session, inputNum);
            session.commit();
            System.out.println(inputNum + "번 글이 삭제되었습니다.");
        } catch (DataNotFoundException e) {
            System.out.println(e.getMessage());
            session.rollback();
        } finally {
            session.close();
        }
    }
}
