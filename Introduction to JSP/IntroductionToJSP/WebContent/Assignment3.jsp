<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment 3</title>
</head>
<body>
	<table style="background-color: hotpink; border: 2px solid black;">
	<tr>
	<th>Number</th>
	<th>Factorial Value</th>
	</tr>
	<%
		for(int i=1;i<=20;i++)
		{
			long fact = 1;
			for(int j=1;j<=i;j++)
			{
				fact *= j;
			}
			%>
			<tr>
			<td><%=i %></td>
			<td><%=fact %></td>
			</tr>
			<%
		}
	%>
	</table>
</body>
</html>