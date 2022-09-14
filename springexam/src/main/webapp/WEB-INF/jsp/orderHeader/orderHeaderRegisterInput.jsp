<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OrderHeaderRegister</title>
</head>
<body>
<h1>注文を追加</h1>
<form:form modelAttribute="orderHeaderForm" action="confirm">
	<dl>
		<dt>注文番号</dt>
		<dd>
			<form:input path="orderNo"/>
		</dd>
		<dt>注文日時</dt>
		<dd>
			<form:input path="orderDatetime"/>
		</dd>
		<dt>会員ID</dt>
		<dd>
			<form:input path="memberId"/>
		</dd>
	</dl>
	<input type="submit" value="追加">
</form:form>
</body>
</html>