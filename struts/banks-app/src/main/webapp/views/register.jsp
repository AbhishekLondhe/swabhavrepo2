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
}</style>
<body>
<h3>Register Here</h3>
<s:actionerror />
<s:form action="validateRegister" method="post">
<s:textfield name="name" label="Name" />
<s:textfield name="password" label="Password" />
<s:textfield name="confirmPassword" label="ConfirmPassword" />
<s:textfield name="balance" label="Balance" />
<center> <s:submit value="Register" /></center>
</s:form>

</body>
</html>