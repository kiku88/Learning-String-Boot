<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SearchResult</title>
</head>
<body>
<h1>会員一覧</h1>
<table>
	<tr>
		<th>会員ID</th>
		<th>氏名</th>
		<th>誕生日</th>
		<th>職種</th>
	</tr>
	<c:forEach items="${members}"  var ="member">
		<tr>
			<td><c:out value="${member.memberId }"/></td>
			<td><c:out value ="${member.lastName}"/></td>
			<td><c:out value="${member.birthday}"></c:out></td>
			<td><c:out value="${member.jobTypeName}"></c:out></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>