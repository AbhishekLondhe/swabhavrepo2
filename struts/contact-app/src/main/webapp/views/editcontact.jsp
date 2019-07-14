<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Contact</title>
</head>
<style>
.errorMessage{
color:red;
list-style-type:none;
}
</style>
<body>
<h1>Edit contact</h1>


<s:form action="validate" method="post">
<s:textfield name="name" label="Name" ></s:textfield>
<s:textfield name="contactNo" label="ContactNo" ></s:textfield>
<s:textfield name="email" label="Email"> </s:textfield>
<center> <s:submit value="EDIT" /></center>
</s:form>
</body>
</html>