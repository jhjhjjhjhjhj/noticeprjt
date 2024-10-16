package com.human.notice.service;

import java.util.List;
import com.human.notice.vo.NoticeVO;
import com.human.notice.vo.SearchVO;

public interface NoticeService {
    List<NoticeVO> getNoticeList(SearchVO searchVO);
    void insertNotice(NoticeVO noticeVO);
    NoticeVO getNotice(int n_idx);
}
