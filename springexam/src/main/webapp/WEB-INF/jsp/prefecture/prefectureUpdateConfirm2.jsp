<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>都道府県を更新(確認)</h1>
	<dl>
		<dt>ID</dt>
		<dd>
			<c:out value="${prefectureForm.id}" />
		</dd>
		<dt>都道府県名</dt>
		<dd>
			<c:out value="${prefectureForm.name}" />
		</dd>
		<dt>人口</dt>
		<dd>
			<c:out value="${prefectureForm.population}" />
		</dd>
		<dt>3地方区分</dt>
		<dd>
			<c:out value="${section3.name}" />
		</dd>
		<dt>8地方区分</dt>
		<dd>
			<c:out value="${section8.name}" />
		</dd>
		<dt>インフラ有無</dt>
		<dd>
			<c:forEach items="${infrastructureList}" var="infrastructure">
				<c:out value="${infrastructure.name}" />
			</c:forEach>
		</dd>
	</dl>
	<form:form modelAttribute="prefectureForm2">
		<form:hidden path="id" />
		<form:hidden path="name" />
		<form:hidden path="population" />
		<form:hidden path="section3Id" />
		<form:hidden path="section8Id" />
		<form:hidden path="infrastructureIdList" />
		<input type="submit" value="OK" formaction="update">
		<input type="submit" value="戻る" formaction="input">
	</form:form>
</body>
</html>