<%@page import="lombok.EqualsAndHashCode.Include"%>
<%@page import="org.te.ems.beans.EmployeesInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%   
String msg = (String) request.getAttribute("msg");
%>
<%@ include file="header.jsp"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS| Delete </title>
</head>              
<body>
<%if(msg != null && !msg.isEmpty()){ %>
<h1> <%= msg %> </h1>
<%} %>
	<fieldset>
		<legend> Delete </legend>
		<form action="./delete">
			<table>
				<tr>
					<th>User ID</th>
					<th>:</th>
					<td><input type="number" name="id" required="required">
					</td>
				</tr>
				<tr>
					<th><input type="submit" value="Delete"></th>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>
