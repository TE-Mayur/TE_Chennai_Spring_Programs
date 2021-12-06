<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Material</title>
</head>
<body>
	<fieldset>
		<legend>Material Details</legend>
	<!--	 <form action="./details1" method="post">  -->
	 	<form action="./details2" method="post">
	<!--	 <form action="./details3" method="post"> -->
		<!-- <form action="./details4" method="post">  -->
			<table>
				<tr>
					<td>Quantity</td>
					<td><input type="number" name="quantity"></td>
				</tr>
				<tr>
					<td>Product</td>
					<td><input type="text" name="product"></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><input type="number" name="price"></td>
				</tr>
				<tr>
					<td>Brand</td>
					<td><input type="text" name="brand"></td>
				</tr>
				<tr>
					<td>Material Type</td>
					<td><input type="text" name="type"></td>
				</tr>
				<tr>
					<td>GST Price</td>
					<td><input type="number" name="gst"></td>
				</tr>
				<tr>
					<td>Quality</td>
					<td><input type="text" name="quality"></td>
				</tr>
				<tr>
					<td><input type="submit" value="OK"></td>
				</tr>
			</table>
		</form>

	</fieldset>
</body>
</html>