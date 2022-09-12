<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Result</title>
</head>
<body>
	<h1>ID: ${param.publisherId }の検索結果</h1>
	<dl>
		<dt>Id<dt>
		<dd>${publisher.publisherId }</dd>
		<dt>名称<dt>
		<dd>${publisher.publisherName }</dd>
		<dt>都道府県<dt>
		<dd>${publisher.prefecture }</dd>
	</dl>	
</body>
</html>