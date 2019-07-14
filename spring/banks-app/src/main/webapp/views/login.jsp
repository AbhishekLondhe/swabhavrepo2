<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<style>
.errorMessage{
color:red;
list-style-type:none;
}</style>
<body>

<h3>Login Here</h3>
<s:actionerror />
<s:form action="validateLogin" method="post">
<s:textfield name="userName" label="UserName" />
<s:textfield name="password" label="Password" />
<center> <s:submit value="Login" /></center>
</s:form>
</body>
</html>