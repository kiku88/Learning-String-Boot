<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>社員登録確認</title>
    </head>
    <body>
    	<p class="error"></p>
    	<h2>社員登録確認</h2> 	
    	<div>
    		<form action="employeeInsert" method="POST">
    			<dl>
				  <dt>社員番号</dt>
				  <dd><c:out value = "${empNo}"/></dd>
				  <dt>社員名</dt>
				  <dd><c:out value = "${name}"/></dd>
				</dl>
	    		<button>登録確認</button>
	    		<input value="<c:out value = "${empNo}"/>" name="empNo" type="hidden"/>
	    		<input value="<c:out value = "${name}"/>" name="name" type="hidden"/>
    		</form>
    	</div>  
    </body>
</html>