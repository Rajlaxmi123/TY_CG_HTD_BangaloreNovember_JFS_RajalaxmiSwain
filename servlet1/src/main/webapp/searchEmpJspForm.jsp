<%@page import="com.capgemini.mywebapp.beans.EmployeeInfoBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <%EmployeeInfoBeans employeeInfoBeans = (EmployeeInfoBeans) request.getAttribute("employeeInfoBeans"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Search Employee</legend>
		<form action="./searchEmployee3" method = "get">
			Employee Id :<input type="number" name="empId" required> <br>
			<input type="submit" value ="Search">
		</form>
	</fieldset>
	<br><br>
	
	<%if(employeeInfoBeans == null)  {%>
	<h3 style="color:red;">Employee Id Not Found!</h3>
	<% }else {%>
	<h3 style="color:green;">Details for Employee Id <%=employeeInfoBeans.getEmpId() %></h3><br>
	Employee Name=<%=employeeInfoBeans.getEmpName() %><br>
	Age = <%=employeeInfoBeans.getAge() %><br>
	Salary = <%=employeeInfoBeans.getSalary() %><br>
	Designation = <%=employeeInfoBeans.getDesignation() %>
	<%} %>
</body>
</html>