<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>
<body>
	<center><strong>Count of Contacts:<s:property value="count" /></strong></center>
	<table class='table table-bordered'>
		<thead>
			<th>ID</th>
			<th>Name</th>
			<th>contact NO.</th>
			<th>Email</th>
			<th>EDIT</th>
			<th>DELETE</th>
		</thead>
		<tbody>
			<s:iterator value="contactList">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="contactNo" /></td>
					<td><s:property value="email" /></td>
					<td><s:a href="edit?id=%{id}"><button class="btn btn-warning ">EDIT</button></s:a></td>
					<td><s:a href="delete?id=%{id}"><button class="btn btn-danger ">DELETE</button></s:a></td>	
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>