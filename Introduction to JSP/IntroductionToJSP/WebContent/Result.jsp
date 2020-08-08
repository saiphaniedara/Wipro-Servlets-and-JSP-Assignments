<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prime Numbers Below <%=request.getParameter("num") %></title>
</head>
<body>
	<table style="background-color: grey; text-align: center; border: 2px solid black;">
		<tr><th>Prime Numbers Below <%=request.getParameter("num") %></th></tr>
		<%
			ArrayList<Integer> primes = (ArrayList<Integer>)request.getAttribute("Primes");
			for(int a: primes)
			{
				%>
				<tr><td>
				<%=a %>
				</td></tr>
				<%
			}
		%>
	</table>
</body>
</html>