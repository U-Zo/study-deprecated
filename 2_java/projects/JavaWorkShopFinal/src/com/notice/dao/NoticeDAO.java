package com.notice.dao;

import com.employee.exception.DataNotFoundException;
import com.notice.entity.Notice;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class NoticeDAO {
    public List<Notice> selectAllNotice(SqlSession session) {
        List<Notice> list = null;
        list = session.selectList("notice.selectAllNotice");

        return list;
    }

    public Notice selectDetailNotice(SqlSession session, String noticeNum) throws DataNotFoundException {
        Notice notice = null;
        notice = session.selectOne("notice.selectDetailNotice", Integer.parseInt(noticeNum));
        if (notice == null) throw new DataNotFoundException("에러발생: 일치하는 번호를 가진 공지사항이 없습니다.");

        return notice;
    }

    public void noticeUpdate(SqlSession session, Notice notice) throws DataNotFoundException {
        int n = 0;
        n = session.update("notice.noticeUpdate", notice);
        if (n == 0) throw new DataNotFoundException("에러발생: 일치하는 번호를 가진 공지사항이 없습니다.");
    }

    public void noticeDelete(SqlSession session, String inputNum) throws DataNotFoundException {
        int n = 0;
        n = session.delete("notice.noticeDelete", Integer.parseInt(inputNum));
        if (n == 0) throw new DataNotFoundException("에러발생: 일치하는 번호를 가진 공지사항이 없습니다.");
    }
}
