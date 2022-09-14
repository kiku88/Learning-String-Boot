<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OrderHeaderList</title>
<style>
	td.sunday{
		color:red;
	}
</style>
</head>
<body>
	<h1>検索結果</h1>
	<table>
		<tr>
			<th>注文番号</th>
			<th>会員ID</th>
			<th>注文日時</th>
			<th>曜日</th>
		</tr>
		<c:forEach items = "${orderHeaderList }" var= "orderHeader">
		<tr>
			<td><c:out value="${orderHeader.orderNo}"></c:out></td>
			<td><c:out value="${orderHeader.memberId}"></c:out></td>
			<td><fmt:formatDate pattern= "yyyy年MM月dd日" value="${orderHeader.orderDatetime}"/></td>
			<fmt:formatDate var="dayOfWeek" pattern= "E" value="${orderHeader.orderDatetime}"/>
			<td <c:if test="${dayOfWeek=='Sun'}">class="sunday"</c:if>>${dayOfWeek}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>