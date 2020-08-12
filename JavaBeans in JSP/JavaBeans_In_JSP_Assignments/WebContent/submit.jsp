<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.wipro.bean.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submission Page</title>
<style>
	table{
		border:2px solid black;
	}
	tr,td {
		border:2px solid black;
	}
</style>
</head>
<body>
	<jsp:useBean id="employee" class="com.wipro.bean.Employee"/>
	<jsp:setProperty property="*" name="employee"/>
	<h1 style="color:green;">Employee Details added to bean</h1>
	<table>
		<tr>
		<th colspan="2" style="text-align: center;">Employee Details</th>
		</tr>
		<tr>
		<td>Employee Name</td>
		<td><jsp:getProperty property="name" name="employee"/></td>
		</tr>
		<tr>
		<td>Employee ID</td>
		<td><jsp:getProperty property="id" name="employee"/></td>
		</tr>
		<tr>
		<td>Basic Salary</td>
		<td><jsp:getProperty property="basicSal" name="employee"/></td>
		</tr>
		<tr>
		<td>HRA</td>
		<td><jsp:getProperty property="hra" name="employee"/></td>
		</tr>
		<tr>
		<td>DA</td>
		<td><jsp:getProperty property="da" name="employee"/></td>
		</tr>
	</table>
</body>
</html>