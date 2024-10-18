package com.human.notice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.human.notice.service.NoticeService;
import com.human.notice.vo.NoticeVO;
import com.human.notice.vo.SearchVO;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class NoticeController {

    private NoticeService noticeServiceImpl;

    @GetMapping("/")
    public String home(@ModelAttribute("searchVO") SearchVO vo, Model model) {
        List<NoticeVO> noticeList;

        if (vo.getSearchKeyword() != null || vo.getN_category() != null) {
            noticeList = noticeServiceImpl.getNoticeList(vo);
        } else {
            noticeList = noticeServiceImpl.getNoticeList();
        }

        model.addAttribute("noticeList", noticeList);
        model.addAttribute("currentCategory", vo.getN_category());

        return "notice/notice_list";
    }


	@GetMapping("/write.do")
	public String write() {
		return "notice/notice_write";
	}
	

    @PostMapping("/writeProcess.do")
    public String writeProcess(NoticeVO vo, HttpServletRequest request) {
    	noticeServiceImpl.insertNotice(vo, request);
        return "redirect:/";
    }
}
