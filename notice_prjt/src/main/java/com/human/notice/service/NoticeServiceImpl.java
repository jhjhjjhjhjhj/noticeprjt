package com.human.notice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.human.notice.repository.NoticeDAO;
import com.human.notice.vo.NoticeVO;
import com.human.notice.vo.SearchVO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class NoticeServiceImpl implements NoticeService {

    private NoticeDAO noticeDAO;

    @Override
    public List<NoticeVO> getNoticeList(SearchVO searchVO) {
        return noticeDAO.getNoticeList(searchVO);
    }

    @Override
    public void insertNotice(NoticeVO noticeVO) {
        noticeDAO.insertNotice(noticeVO);
    }

    @Override
    public NoticeVO getNotice(int n_idx) {
        return noticeDAO.getNotice(n_idx);
    }


}
