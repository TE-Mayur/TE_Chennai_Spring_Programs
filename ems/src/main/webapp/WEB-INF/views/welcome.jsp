<%@page import="org.te.ems.beans.EmployeesInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	EmployeesInfo info = (EmployeesInfo) request.getAttribute("user");
%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS | Welcome</title>
</head>
<body>
	<%
		if (info != null) {
	%>
	<h2 style="text-align: center">
		Welcome
		<%=info.getName()%></h2>
	<%
		}
	%>
</body>
</html>