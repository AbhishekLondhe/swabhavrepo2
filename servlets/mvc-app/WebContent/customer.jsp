<%@ page import="java.util.*"%>
<%@ page import="com.techlabs.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer App</title>
</head>
<body>
	<%
		List<Customer> list = (List) request.getAttribute("customer");
	out.print("<table> ");
	out.print("<thead><tr><th>id</th><th>FirstName</th><th>LastName</th><th>Balance</th><th>CardType</th><th>DOB</th><th>Update</th><th>Delete</th></tr></head>");
	out.print("<tbody>");
	for (Customer c : list) {
		out.print("<tr>");
		out.print("<td>"+c.getId()+"</td>");
		out.print("<td>"+c.getFirstName()+"</td>");
		out.print("<td>"+c.getLastName()+"</td>");
		out.print("<td>"+c.getBalance()+"</td>");
		out.print("<td>"+c.getCard()+"</td>");
		out.print("<td>"+c.getDob()+"</td>");
		out.print("<td><a href='EditCustomer?id="+c.getId()+"'>Edit</a></td>");
		out.print("<td><a href='DeleteCustomer?id="+c.getId()+"'>Delete</a></td>");
		out.println("</tr>");
		
	}
	out.print("</tbody>");
	%>
</body>
</html>