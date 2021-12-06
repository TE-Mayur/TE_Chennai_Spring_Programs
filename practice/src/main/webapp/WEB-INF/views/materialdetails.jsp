<%@page import="org.te.practice.beans.MaterialDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	Integer quantity = (Integer) request.getAttribute("quantity");
String product = (String) request.getAttribute("product");
Double price = (Double) request.getAttribute("price");
String brand = (String) request.getAttribute("brand");
String type = (String) request.getAttribute("type");
Double gst = (Double) request.getAttribute("gst");
String quality = (String) request.getAttribute("quality");
MaterialDetails detail = (MaterialDetails) request.getAttribute("Material");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>
		Product quantity =
		<%=quantity%>
	</h3>
	<h3>
		Product product =
		<%=product%>
	</h3>
	<h3>
		Product price =
		<%=price%>
	</h3>
	<h3>
		Product brand =
		<%=brand%>
	</h3>
	<h3>
		Product type =
		<%=type%>
	</h3>
	<h3>
		Product gst =
		<%=gst%>
	</h3>
	<h3>
		Product quality =
		<%=quality%>
	</h3>

<%-- <% if(detail !=null){ %> --%>
<%-- <h3>user quantity = <%= detail.getQuantity()  %> </h3> 
<h3>user product = <%= detail.getProduct()  %> </h3> 
<h3>user price = <%= detail.getPrice()  %> </h3> 
<h3>user brand = <%= detail.getBrand()  %> </h3> '
<h3>user type = <%= detail.getMaterialType()  %> </h3> 
<h3>user gst = <%= detail.getGstPrice()  %> </h3> 
<h3>user quality = <%= detail.getQuality() %> </h3> --%> 
<%-- <%}%> --%>
</body>
</html>