package com.human.notice.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.human.notice.vo.NoticeVO;
import com.human.notice.vo.SearchVO;

public interface NoticeService {
    List<NoticeVO> getNoticeList(SearchVO vo);
    List<NoticeVO> getNoticeList();
    void insertNotice(NoticeVO noticeVO, HttpServletRequest request);
}
