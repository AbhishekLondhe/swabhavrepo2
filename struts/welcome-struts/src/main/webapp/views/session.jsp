<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>session jsp</title>
</head>
<body>
<h1>session Action</h1>
old count:<s:property value="#session.count - 1 "/> <br>
new count:<s:property value="#session.count"/>
</body>
</html>