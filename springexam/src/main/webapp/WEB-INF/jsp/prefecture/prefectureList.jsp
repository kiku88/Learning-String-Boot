<%@page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style> td.bigcity{color: red}</style>
</head>
<body>
	<h1>検索結果</h1>
	<table border = 1>
		<tr>
			<th>都道府県名</th>
			<th>人口</th>
			<th>3地方区分</th>
			<th>8地方区</th>
		</tr>
		<c:forEach items="${prefectureList}" var="prefecture">
		<tr>
			<td><c:out value="${prefecture.name}"/></td>
			<td <c:if test="${prefecture.population>2000000}">class="bigcity"</c:if>><fmt:formatNumber
					pattern="#,###" value="${prefecture.population}"/></td>
			<td><c:out value="${prefecture.section3Id}"/>
				<input type = "checkbox" name ="" value="" checked = "checked"/></td>;
			<td><c:out value="${prefecture.section8Id}"/></td>
		</tr>
		</c:forEach>
	</table>	
</body>
</html>