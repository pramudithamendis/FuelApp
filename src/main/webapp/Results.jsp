<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% int n = (Integer)request.getAttribute("sum"); %>

<h1><%=n %></h1>
<h1>Hi</h1>
<a href="index.jsp">index</a>
</body>
</html>