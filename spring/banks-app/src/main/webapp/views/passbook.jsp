<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passbook</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="home">Bank-App</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="passbook">Passbook</a></li>
				<li><a href="transaction"> Add Transaction</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="logout"><span
						class="glyphicon glyphicon-log-out"></span> Logout</a></li>
			</ul>
		</div>
	</nav>

	<center><strong>Total of transactions:<s:property value="count" /></strong></center>
	<table class='table table-bordered'>
		<thead>
			<th>Name</th>
			<th>Date</th>
			<th>Type</th>
			<th>Amount</th>
		</thead>
		<tbody>
			<s:iterator value="transactionList">
				<tr>
					<td><s:property value="name" /></td>
					<td><s:property value="date" /></td>
					<td><s:property value="type" /></td>
					<td><s:property value="amount" /></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>