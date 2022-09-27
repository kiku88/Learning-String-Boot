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
	<h1>都道府県を更新</h1>
	<form:form modelAttribute="prefectureForm2" action="confirm">
		<dl>
			<dt>ID</dt>
			<dd>
				<form:errors path="id" element="p" />
				<form:input path="id" />
			</dd>
			<dt>都道府県名</dt>
			<dd>
				<form:errors path="name" element="p" />
				<form:input path="name" />
			</dd>
			<dt>人口</dt>
			<dd>
				<form:errors path="population" element="p" />
				<form:input path="population" />
			</dd>
			<dt>3地方区分</dt>
			<dd>
				<form:select path="section3Id">
					<form:option value="" label="なし" />
					<form:options items="${section3List}" itemValue="id"
						itemLabel="name" />
				</form:select>
			</dd>
			<dt>8地方区分</dt>
			<dd>
				<form:checkboxes items="${section8List}" itemValue="id"
					itemLabel="name" path="section8Id" />
			</dd>
			<dt>インフラ有無</dt>
			<dd>
				<form:checkboxes items="${infrastructureList}" itemValue="id"
					itemLabel="name" path="infrastructureIdList" />
			</dd>
		</dl>
		<input type="submit" value="更新">
	</form:form>
</body>
</html>