package com.human.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.human.notice.service.NoticeService;
import com.human.notice.vo.NoticeVO;
import com.human.notice.vo.SearchVO;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/notice/**")
@AllArgsConstructor
public class NoticeController {

    private NoticeService noticeService;

    @GetMapping("/")
    public String home() {
        return "notice/notice_list";
    }
    
    @GetMapping("/notice_list")
    public String list(SearchVO searchVO, Model model) {
        model.addAttribute("noticeList", noticeService.getNoticeList(searchVO));
        return "notice/notice_list";
    }

    @GetMapping("/notice_write")
    public String write() {
        return "notice/notice_write";
    }

    @PostMapping("/notice_write")
    public String writeProcess(NoticeVO noticeVO) {
        noticeService.insertNotice(noticeVO);
        return "notice/notice_list";
    }
}
