<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<style>
.errorMessage{
color:red;
list-style-type: none;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:actionerror />
<s:form action="validate" method="post">
<s:textfield name="userName" label="UserName" />
<s:password name="password" label="Password" />
 <s:submit value="validate" />
</s:form>

</body>
</html>