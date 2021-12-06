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
	<h1>INSERT COMPUTERS</h1>
	<form action="Insert" method="get">
		<table>
			<tr>
				<td>Computer name</td>
				<td>
					<input type="text" name="comName" />
				</td>
			</tr>
			<tr>
				<td>Producer</td>
				<td>
					<input type="text" name="producer" />
				</td>
			</tr>
			<tr>
				<td>Year Making</td>
				<td>
					<input type="number" name="yearMaking" />
				</td>
			</tr>
			<tr>
				<td>Expire Date</td>
				<td>
					<input type="date" name="expireDate" />
				</td>
			</tr>
			<tr>
				<td>Configuration</td>
				<td>
					<input type="text" name="configuration" />
				</td>
			</tr>
			<tr>
				<td>Price</td>
				<td>
					<input type="number" name="price" />
				</td>
			</tr>
		</table>
		<input type="submit" value="Submit"/>
	</form>

	<a href="index.jsp">BACK</a>
</body>
</html>