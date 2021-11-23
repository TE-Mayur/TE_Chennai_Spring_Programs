<%@page import="java.util.List"%>
<%@page import="org.te.ems.beans.EmployeesInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	List<EmployeesInfo> ref = (List<EmployeesInfo>) request.getAttribute("employee");
	String msg = (String) request.getAttribute("err");

%>

<%@ include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS|GetAll</title>
</head>
<body>
	<fieldset>
		<legend> All Employees Details</legend>
		<form action="">
			<table style="border: 1">
			<%  for (EmployeesInfo get : ref) {%>
			<table style="border: 1">
  <tr>



				<tr>
					<th>Employee Id</th>
					<th>:</th>
					<td><%=get.getId()%></td>
				</tr>
				<tr>
					<th>Employee Name</th>
					<th>:</th>
					<td><%=get.getName()%></td>
				</tr>
				<tr>
					<th>Employee MobileNo</th>
					<th>:</th>
					<td><%=get.getMobile()%></td>
				</tr>
				<tr>
					<th>Employee Mail</th>
					<th>:</th>
					<td><%=get.getMail()%></td>
				</tr>
				<tr>
					<th>Employee DOB</th>
					<th>:</th>
					<td><%=get.getDob()%></td>
				</tr>
				<tr>
					<th>Employee Password</th>
					<th>:</th>
					<td><%=get.getPwd()%></td>
				</tr>
				<tr> <th>------------------------------------------------------------------------------ </th>
				<th>=</th>
				<td>-------------------------------------------------------------------------------</td>
				</tr>
				</table>
				<%} %>
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>