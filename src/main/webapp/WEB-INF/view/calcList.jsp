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

${calcList} //반복하여 출력함...

<c:forEach items="${calcList}" var="calc" >
	${calc.numberOne} + ${calc.numberTwo} = ${calc.result}<br/>

</c:forEach>

</body>
</html>