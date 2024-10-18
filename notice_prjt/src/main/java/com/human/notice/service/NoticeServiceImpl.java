package com.human.notice.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
    public List<NoticeVO> getNoticeList(SearchVO vo) {
        return noticeDAO.getNoticeList(vo);
    }

    @Override
    public void insertNotice(NoticeVO vo, HttpServletRequest request) {
        noticeDAO.insertNotice(vo);
    }


	@Override
	public List<NoticeVO> getNoticeList() {
		return noticeDAO.getNoticeList();
	}


}
