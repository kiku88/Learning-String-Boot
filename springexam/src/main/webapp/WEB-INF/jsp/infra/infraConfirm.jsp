<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>インフラを追加（確認）</h1>
	<dl>
		<dt>ID</dt>
		<dd>
			<c:out value="${infraForm.id} "></c:out>
		</dd>
		<dt>インフラ名前</dt>
		<dd>
			<c:out value="${infraForm.name }"></c:out>
		</dd>
		<dt>登録日</dt>
		<dd>
			<fmt:formatDate pattern="yyyy/MM/dd" value="${infraForm.insertDate}"/>
		</dd>
	</dl>
	<form:form modelAttribute="infraForm" action="input">
		<form:input type="hidden" path="id" />
		<form:input type="hidden" path="name" />
		<form:input type="hidden" path="insertDate" />
		<input type="submit" value="戻る">
	</form:form>

</body>
</html>