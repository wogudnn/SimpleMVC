<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>기사입력</title>
</head>
<body>
	<form name="textform" method="post" action="/SimpleMVC/add">
	기사제목 : <input type="text" name="subject" style="widht: 500px"/><br/>
	기사내용 : <textarea name="content" style="width:500px; heiget: 300px"></textarea>
	<input type="submit" value="기사등록">
	</form>
</body>
</html>