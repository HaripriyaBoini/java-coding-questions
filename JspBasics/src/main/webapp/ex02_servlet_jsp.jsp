<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet vs JSP</title>
</head>
<body>
<p style='font-size:18px;color:blue;text-decoration:underline;'> This content is dynamically prepared</p>

<%
String greeting=request.getParameter("greetings");
out.println("<p>"+greeting+"</p>");
%>

</body>
</html>