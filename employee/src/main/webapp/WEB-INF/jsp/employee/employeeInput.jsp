<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<script type="text/javascript" src="../js/ajax.js"></script>
	<script type="text/javascript" src="../js/check.js"></script>
</head>
<body>
	<div id="err"></div>
	<h1>社員登録</h1>
	<form name="employeeForm" action="employeeConfirm" method="post">
		<dl>
			<dt>社員番号</dt>
			<dd><input type="text" name="empNo" size="40"/><span id="emp" style="color:red"></span></dd>
			<dt>社員名</dt>
			<dd><input type="text" name="name" size="40"/></dd>
		</dl>
		<input type="submit" value="登録" onclick="return doSubmit();"/>
	</form>
</body>
</html>
