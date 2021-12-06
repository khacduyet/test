<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LIST COMPUTERS</h1>
	<table border="1">
		<tr>
			<th>Computer Id</th>
			<th>Computer Name</th>
			<th>Producer</th>
			<th>Year Making</th>
			<th>Expire Date</th>
			<th>Configuration</th>
			<th>Price</th>
		</tr>

		<c:forEach items="${list}" var="c">
			<tr>
				<td>${c.comId}</td>
				<td>${c.comName}</td>
				<td>${c.producer}</td>
				<td>${c.yearMaking}</td>
				<td>${c.expireDate}</td>
				<td>${c.configuration}</td>
				<td>${c.price}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="insert.jsp">INSERT RECORD</a>
</body>
</html>