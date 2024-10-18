<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>공지사항</title>
</head>
<body>
    <h1>공지사항</h1>
    
    <!-- Category tabs -->
<div>
    <a href="?n_category=all" class="${empty currentCategory || currentCategory == 'all' ? 'active' : ''}">전체</a>
    <a href="?n_category=general" class="${currentCategory == 'general' ? 'active' : ''}">일반</a>
    <a href="?n_category=news" class="${currentCategory == 'news' ? 'active' : ''}">오픈소식</a>
    <a href="?n_category=service" class="${currentCategory == 'service' ? 'active' : ''}">서비스</a>
    <a href="?n_category=winners" class="${currentCategory == 'winners' ? 'active' : ''}">당첨자발표</a>
</div>
    
    <!-- Search form -->
	<form action="" method="get">
	    <select name="searchType">
	        <option value="title" ${searchVO.searchType == 'title' ? 'selected' : ''}>제목</option>
	        <option value="content" ${searchVO.searchType == 'content' ? 'selected' : ''}>내용</option>
	        <option value="both" ${searchVO.searchType == 'both' ? 'selected' : ''}>제목+내용</option>
	    </select>
	    <input type="text" name="searchKeyword" placeholder="검색어를 입력해 주세요" value="${searchVO.searchKeyword}">
	    <input type="hidden" name="n_category" value="${currentCategory}"> <!-- 현재 카테고리 유지 -->
	    <button type="submit">검색</button>
	</form>
    
    <!-- Notices table -->
    <table border="1">
        <thead>
            <tr>
                <th>번호</th>
                <th>구분</th>
                <th>제목</th>
                <th>등록일</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="notice" items="${noticeList}">
                <tr>
                    <td>${notice.n_idx}</td>
                    <td>
					    <c:choose>
					        <c:when test="${notice.n_category == 'general'}">일반</c:when>
					        <c:when test="${notice.n_category == 'news'}">오픈소식</c:when>
					        <c:when test="${notice.n_category == 'service'}">서비스</c:when>
					        <c:when test="${notice.n_category == 'winners'}">당첨자발표</c:when>
					        <c:otherwise>${notice.n_category}</c:otherwise>
					    </c:choose>
					</td>
                    <td><a href="view?id=${notice.n_idx}">${notice.n_title}</a></td>
                    <td><fmt:formatDate value="${notice.n_regdate}" type="date" pattern="yyyy-MM-dd" /></td>
                        
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    
   <a href="${pageContext.request.contextPath}/write.do">
      <button type="button" id="write_btn">글등록</button> 
    </a>
</body>
</html>
