<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome-struts</title>
</head>
<body>
<h1>Home Action</h1>
<% for(int i=0;i<10;i++){%>
Message: <s:property value='message' />	
<%} %>

</body>
</html>