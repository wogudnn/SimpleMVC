<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table	style="width:100%; border-collapse: collapse; border: 1px solid #000000">
	
	<tr style="height: 20px">
		<th>News ID</th>	
		<th>Subject</th>	
		<th>Contents</th>	
		<th>Create Date</th>	
		<th>Create Date</th>
		<th>Recommend Count</th>
		<th>Journalist ID</th>
		<th>Category ID</th>	
	</tr>
	
	<c:forEach items="${newses}" var="newses">
	<tr>
		<td>${newses.getNewsId()}</td>
		<td>${newses.getSubject()}</td>
		<td>${newses.getContents()}</td>
		<td>${newses.getCreatedDate()}</td>
		<td>${newses.getRecommendCount()}</td>
		<td>${newses.getJournalistId()}</td>
		<td>${newses.getCategoryId()}</td>	
	</tr>		
	</c:forEach>
	
	</table>
	<a href="/SimpleMVC/write">기사쓰기</a>

	

</body>
</html>