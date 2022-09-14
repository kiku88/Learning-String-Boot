<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OrderHeaderRegisterConfirm</title>
</head>
<body>
<dl>
	<dt>注文番号</dt>
	<dd>
		<c:out value="${orderHeaderForm.orderNo }"></c:out>
	</dd>
	<dt>注文日時</dt>
	<dd>
		<c:out value="${orderHeaderForm.orderDatetime }"></c:out>
	</dd>
	<dt>会員ID</dt>
	<dd>
		<c:out value="${orderHeaderForm.memberId }"></c:out>
	</dd>
</dl>
<form:form modelAttribute="orderHeaderForm"  action="input">
	<form:hidden path="orderNo"/>
	<form:hidden path="orderDatetime"/>
	<form:hidden path="memberId"/>
<input type="submit" value="戻る">
</form:form>
</body>
</html>