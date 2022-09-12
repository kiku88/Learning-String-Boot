<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>都道府県を追加</h1>
		<dl>
			<dt>ID</dt>
			<dd>
				<c:out value="${prefectureForm.id}"/>
			</dd>
			<dt>都道府県名</dt>
			<dd>
				<c:out value="${prefectureForm.name}"/>
			</dd>
			<dt>人口</dt>
			<dd>
				<c:out value="${prefectureForm.population}"/>
			</dd>
		</dl>
	<form:form modelAttribute="prefectureForm" action="input">
		<form:hidden path="id"/>
		<form:hidden path="name"/>
		<form:hidden path="population"/>
		<input type="submit" value="戻る">
	</form:form>
</body>
</html>