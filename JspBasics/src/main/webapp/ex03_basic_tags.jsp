<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Basic jsp tags</title>
<style>

table,th,td {
border:1px solid black;
border-collapse:collapse;
}

th,td{
padding:7px;
}
</style>
</head>
<body>

<h2>Declaration Tag</h2>

<%!
     int number1 = 20;
     int number2 = 20;
     
     String str = "This is a Declaration Tag";
     
     public int add(int number3) { 
         return number1 + number2 + number3;
     }
     
     public String convertToUpperCase(String str) {
         return str.toUpperCase();
     }
%>

<h2>Scriptlet Tag</h2>

<%
int number4 = 60;
out.print("number1 = " + number1 + "<br>");
out.print("number2 = " + number2 + "<br>");
out.print("addition = " + add(number4) + "<br>");
out.print("Uppercase = " + convertToUpperCase(str));

%>

<h2>Expression tag</h2>
<%= "<br/>This is a number1 " + number1 %>

<table>
<tr>
<th>Name</th>
<th>Value</th>
</tr>  <!-- row1 -->

<tr>
<td> Number1</td>
<td> <%= number1 %></td>
</tr>

<tr>
<td> Number2</td>
<td> <%= number2 %></td>
</tr>

<tr>
<td> Number4</td>
<td> <%= number4 %></td>
</tr>

<tr>
<td> Add 3 numbers</td>
<td> <%= add(number4) %></td>
</tr>

<tr>
<td> Uppercase</td>
<td> <%= convertToUpperCase("hi how r u") %></td>
</tr>

</table>

</body>
</html>
