<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
isELIgnored="false"  pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<table border="1">
		<thead>
		<tr>
		<th> Login ID</th>
		<th> First Name</th>
		<th> Last Name</th>
		</tr>
		</thead>
			
			<tbody>
		<c:forEach items="${userList}" var="user">
		<tr>
			<td>${user.loginId }</td>
			<td>${user.firstName }</td>
			<td>${user.lastName }</td>
		</tr>
		</c:forEach>
			</tbody>
		</table>
	
</body>
</html>