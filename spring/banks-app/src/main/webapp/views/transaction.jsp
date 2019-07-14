<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script><style>

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}
</style>

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
	
<div align ="center">
<div class="card" style="max-width: 20rem;">
<div class="card-header">
Transaction
</div>
<div class="card-body">
<s:form action="trans" method="post">
<h4 class="card-title"><s:textfield name="amount" label="Amount"></s:textfield>  </h4>
<p class="card-text">
<s:radio list="{'Withrow ','Deposite'}" name="transaction" multiple="true"></s:radio>
</p>
<p class="card-text"><s:submit type="submit"/></p>
</s:form> 
</div>
</div>

</div>

</body>
</html>