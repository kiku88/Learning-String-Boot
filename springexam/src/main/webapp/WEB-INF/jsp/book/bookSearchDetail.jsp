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
	<h1>ID:<c:out value=" ${param.bookId }"/>の検索結果</h1>
	<dl>
		<dt>Id<dt>
		<dd><c:out value=" ${book.bookId }"/></dd>
		<dt>名称<dt>
		<dd><c:out value ="${book.bookName }"/></dd>
		<dt>値段<dt>
		<dd><fmt:formatNumber pattern="#,###" value = "${book.price }"/></dd>
	</dl>	
</body>
</html>