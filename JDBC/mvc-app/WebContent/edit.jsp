<%@ page import="com.techlabs.model.Customer" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String firstName,lastName,dob;
		String balance;
		Customer customer=(Customer) request.getAttribute("editCustomer");
		firstName=customer.getFirstName();
		lastName=customer.getLastName();
		dob=customer.getDob();
		balance=Double.toString(customer.getBalance());
		
		
	%>
	<form action="EditCustomer" Method="POST">
		<br>First
		name:<br> <input type="text" name="firstname" value="<%=firstName%>"> <br>
		Last name:<br> <input type="text" name="lastname" value="<%=lastName%>" > <br>
		Balance:<br> <input type="number" name="balance" value="<%=balance%>"> <br>
		CardType: <input type="radio" name="cardtype" value="debit">
		Debit <input type="radio" name="cardtype" value="credit">
		Credit <br> DOB:<br> <input type="date" name="dob" value="<%=dob %>"><br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>