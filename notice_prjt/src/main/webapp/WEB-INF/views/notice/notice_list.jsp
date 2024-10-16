<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <a href="?category=all">전체</a>
        <a href="?category=general">일반</a>
        <a href="?category=news">오픈소식</a>
        <a href="?category=service">서비스</a>
        <a href="?category=winners">당첨자발표</a>
    </div>
    
    <!-- Search form -->
    <form action="" method="get">
        <input type="text" name="searchKeyword" placeholder="검색어를 입력해 주세요">
        <button type="submit">검색</button>
    </form>
    
    <!-- Notices table -->
    <table>
        <thead>
            <tr>
                <th>번호</th>
                <th>구분</th>
                <th>제목</th>
                <th>등록일</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="notice" items="${notices}">
                <tr>
                    <td>${notice.n_idx}</td>
                    <td>${notice.n_category}</td>
                    <td><a href="view?id=${notice.n_idx}">${notice.n_title}</a></td>
                    <td>${notice.n_regdate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    <!-- Pagination -->
    <!-- TODO: Add pagination -->
    
    <!-- Add Notice button -->
    <a href="write">공지사항 등록</a>
</body>
</html>
