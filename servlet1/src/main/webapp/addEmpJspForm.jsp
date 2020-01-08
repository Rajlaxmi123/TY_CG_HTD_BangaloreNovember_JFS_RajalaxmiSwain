<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <%String msg =(String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><a href="./home">Home</a></h4>
<fieldset>

		<legend>Add Employee</legend>
		<form action="./addEmployee2" method="post">
			<table>
				<tr>
					<td>Employee Id</td>
					<td>:</td>
					<td><input type="number" name="empId" required></td>
				</tr>

				<tr>
					<td>Employee Name</td>
					<td>:</td>
					<td><input type="text" name="name" required></td>
				</tr>

				<tr>
					<td>Age</td>
					<td>:</td>
					<td><input type="number" name="age" required></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td>:</td>
					<td><input type="number" name="salary" required></td>
				</tr>

				<tr>
					<td>Designation</td>
					<td>:</td>
					<td><input type="text" name="designation" required></td>
				</tr>

				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br> 
					<input type="submit" value="Add">
					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%if(msg !=null && !msg.isEmpty()){ %>
	<h4 style="color:navy"><%=msg %></h4>
	<%} %>
</body>
</html>