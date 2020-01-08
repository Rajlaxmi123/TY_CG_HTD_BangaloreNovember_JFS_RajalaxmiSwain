<%@page import="com.capgemini.mywebapp.beans.EmployeeInfoBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <%String msg =(String) request.getAttribute("msg"); %>
    <%EmployeeInfoBeans employeeInfoBeans = (EmployeeInfoBeans) request.getAttribute("employeeInfoBeans"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><a href="./home">Home</a></h4>
<fieldset>

		<legend>Update Employee</legend>
		<form action="./updateEmployee2" method="post">
			<table>
				<tr>
					<td>Employee Id</td>
					<td>:</td>
					<td><input type="number" name="empId" required></td>
				</tr>

				<tr>
					<td>Employee Name</td>
					<td>:</td>
					<td><input type="text" name="name" ></td>
				</tr>

				<tr>
					<td>Age</td>
					<td>:</td>
					<td><input type="number" name="age" ></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td>:</td>
					<td><input type="number" name="salary" ></td>
				</tr>

				<tr>
					<td>Designation</td>
					<td>:</td>
					<td><input type="text" name="designation" ></td>
				</tr>

				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br> 
					<input type="submit" value="Update">
					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%if(msg !=null && !msg.isEmpty()){ %>
	<h4 style="color:red"><%=msg %></h4>
	<%} %>
</body>
</html>