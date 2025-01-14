package com.human.notice.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.notice.vo.NoticeVO;
import com.human.notice.vo.SearchVO;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class NoticeDAO {

    private SqlSession sqlSession;
    
    private static final String MAPPER = "com.human.notice.mapper.NoticeMapper";

    public List<NoticeVO> getNoticeList(SearchVO searchVO) {
        return sqlSession.selectList(MAPPER + ".getNoticeList", searchVO);
    }

    public void insertNotice(NoticeVO vo) {
        sqlSession.insert(MAPPER + ".insertNotice", vo);
    }

    public NoticeVO getNotice(int n_idx) {
        return sqlSession.selectOne(MAPPER + ".getNotice", n_idx);
    }

	public List<NoticeVO> getNoticeList() {
		List<NoticeVO> noticeList =  sqlSession.selectList(MAPPER+".getNoticeList");
		return noticeList;
	}


}
