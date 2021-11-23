<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS | Sign Up</title>
</head>
<body>
<fieldset>
		<legend>Sign up </legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<th>User ID</th>
					<th>:</th>
					<td><input type="number" name="id" required="required">
				</tr>
				<tr>
					<th>User Name</th>
					<th>:</th>
					<td><input type="name" name="name" required="required">
				</tr>
				<tr>
					<th>User Mobile Number</th>
					<th>:</th>
					<td><input type="number" name="mobile" required="required">
				</tr>
				<tr>
					<th>User Email ID</th>
					<th>:</th>
					<td><input type="email" name="mail" required="required">
				</tr>
				<tr>
					<th>User DOB</th>
					<th>:</th>
					<td><input type="date" name="dob" required="required">
				</tr>
				<tr>
					<th>User Password</th>
					<th>:</th>
					<td><input type="password" name="pwd" required="required">
				</tr>
				<tr>
					<th><input type="submit" value="Signup" required="required"> </th>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>