<%@page import="com.te.springmvc.beans.UserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String name =(String) request.getAttribute("userName");
    	Integer id =(Integer) request.getAttribute("userId");
    	UserDetails user = (UserDetails) request.getAttribute("data");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(id !=null){ %>
<h3>User id	 = <%= id  %> </h3> 
<h3>User name = <%= name  %> </h3> 
<%}%>

<% if(user !=null){ %>
<h3>User id	 = <%= user.getId()  %> </h3> 
<h3>User name = <%= user.getName()  %> </h3> 
<%}%>
</body>
</html>