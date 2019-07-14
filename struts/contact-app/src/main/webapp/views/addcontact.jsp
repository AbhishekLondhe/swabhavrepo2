<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.errorMessage{
color:red;
list-style-type:none;
}
</style>
<body>
<h1>Add contact</h1>
<s:actionerror />
<s:form action="add" method="post">
<s:textfield name="name" label="Name" />
<s:textfield name="contactNo" label="ContactNo" />
<s:textfield name="email" label="Email" />
<center> <s:submit value="ADD" /></center>
</s:form>

</body>
</html>