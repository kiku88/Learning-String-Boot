<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Result</title>
</head>
<body>
	<h1>ID:<c:out value=" ${param.orderNo }"/>の検索結果</h1>
	<dl>
		<dt>注文番号<dt>
		<dd><c:out value=" ${orderHeader.orderNo }"/></dd>
		<dt>注文日時<dt>
		<dd><fmt:formatDate pattern = "yyyy年MM月dd日" value ="${orderHeader.orderDatetime }"/></dd>
		<dt>会員ID<dt>
		<dd><c:out value ="${orderHeader.memberId }"/></dd>
	</dl>	
</body>
</html>