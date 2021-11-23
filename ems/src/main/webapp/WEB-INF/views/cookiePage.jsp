<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookies</title>
</head>
<body>
	<button>
		<a href="./read"> Read Cookies </a>
	</button>
	<button>
		<a href="./create"> Crea Cookies </a>
	</button>

	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h2><%=msg%></h2>
	<%
		}
	%>
	
</body>
</html>