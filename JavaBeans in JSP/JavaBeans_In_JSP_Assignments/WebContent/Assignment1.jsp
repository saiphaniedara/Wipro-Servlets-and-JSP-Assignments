<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment 1</title>
</head>
<body>
<div>
	<form action="submit.jsp" method="post">
		<label for="name">Employee Name</label>
		<input type="text" name="name"><br>
		<label for="id">Employee ID</label>
		<input type="number" name="id"><br>
		<label for="basicSal">Basic Salary</label>
		<input type="number" name="basicSal"><br>
		<label for="hra">HRA</label>
		<input type="number" name="hra"><br>
		<label for="da">DA</label>
		<input type="number" name="da"><br>
		<input type="submit" value="Submit">
	</form>
</div>
</body>
</html>