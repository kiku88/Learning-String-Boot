<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>社員一覧</title>
    </head>
    <body>
    	<h2>社員一覧</h2>
   		<form name="fm" action="emp/employeeInput"></form>
   		<button onclick="document.fm.submit();">新規登録</button>
   		<hr>
        <table border="1">
            <thead>
                <tr>
                    <th>社員番号</th>
                    <th>社員名</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${employees}" var="employee">
                    <tr>
                        <td>${employee.empNo}</td>
                        <td>${employee.name}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>