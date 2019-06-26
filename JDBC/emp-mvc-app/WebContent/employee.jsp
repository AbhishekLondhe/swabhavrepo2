<%@ page import="java.util.*"%>
<%@ page import="com.techlabs.model.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  </head>
<body>
	<%
	List<Employee> list = (List) request.getAttribute("employee");
	out.println("<div class='container'>");
	out.print("<table class='table table-bordered'>" );
	out.print("<thead><tr><th>empno</th><th>ename</th><th>job</th><th>mgr</th><th>hiredate</th><th>sal</th><th>comm</th><th>deptno</th></tr></head>");
	out.print("<tbody>");
	for (Employee emp : list) {
		out.print("<tr>");
		out.print("<td>"+emp.getEmpno()+"</td>");
		out.print("<td>"+emp.getEname()+"</td>");
		out.print("<td>"+emp.getJob()+"</td>");
		out.print("<td>"+emp.getMgr()+"</td>");
		out.print("<td>"+emp.getHiredate()+"</td>");
		out.print("<td>"+emp.getSal()+"</td>");
		out.print("<td>"+emp.getComm()+"</td>");
		out.print("<td>"+emp.getDeptno()+"</td>");
		out.println("</tr>");
	}
	out.print("</tbody>");
	out.println("</div>");
	%>
</body>
</html>