package com.notice.biz;

import com.notice.entity.Notice;

import java.util.List;

public interface INoticeBiz {
    List<Notice> selectAllNotice();

    Notice selectDetailNotice(String noticeNum);

    void noticeUpdate(Notice notice);

    void noticeDelete(String inputNum);
}
