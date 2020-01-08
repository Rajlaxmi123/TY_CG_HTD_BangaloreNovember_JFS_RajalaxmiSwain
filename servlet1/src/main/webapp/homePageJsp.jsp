<%@page import="com.capgemini.mywebapp.beans.EmployeeInfoBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <%HttpSession session= request.getSession(false);
    EmployeeInfoBeans employeeInfoBeans= (EmployeeInfoBeans) session.getAttribute("employeeInfoBeans") ;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3 style="color:navy;">Welcome <%=employeeInfoBeans.getEmpName() %></h3>
<a href="./addEmpJsp"> Add Employee</a><br>
<a href="./updateEmpJspForm"> Update Employee</a><br>
<a href="./deleteEmpJspForm"> Delete Employee</a><br>
<a href="./searchEmpJspForm"> Search Employee</a><br>
<a href="./seeAllEmployeeJspForm"> See All Employees</a>
<br>
<a href="./logout2">Logout</a>

</body>
</html>