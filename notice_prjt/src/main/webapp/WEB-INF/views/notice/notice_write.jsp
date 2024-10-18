<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글등록</title>
</head>
<body>
<div id="wrap">
    <h2>글등록</h2>
    <div id="container">
        <form name="frmBoardWrite" action="writeProcess.do" method="post">
             카테고리: 
            <select name="n_category">
                <option value="general">일반</option>
                <option value="news">오픈소식</option>
                <option value="service">서비스</option>
                <option value="winners">당첨자발표</option>
            </select><br><br>
            제목: <input type="text" name="n_title"><br>
            내용<br>
            <textarea name="n_content" cols="30" rows="10"></textarea><br>
            
            <div>
                <input type="submit" value="작성완료">
                <input type="reset" value="다시입력">
                <input type="button" value="목록보기" onclick="location.href='../notice_list'">
            </div>
        </form>

    </div>

</div>
</body>
</html>