<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Details</title>
</head>
<body>
	<jsp:useBean id="employee" class="com.wipro.bean.Employee1" />
	<jsp:setProperty property="*" name="employee"/>
	<%
		request.setAttribute("Employee_Details", employee);
		request.getRequestDispatcher("AddEmployee").forward(request, response);
	%>
</body>
</html>