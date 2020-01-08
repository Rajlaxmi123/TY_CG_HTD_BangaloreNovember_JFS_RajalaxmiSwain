<%@page import="com.capgemini.mywebapp.beans.EmployeeInfoBeans"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <%List<EmployeeInfoBeans> employeelist = (List<EmployeeInfoBeans>) request.getAttribute("employeelist");
    String msg = (String) request.getAttribute("msg");%>
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
		<form action=".//seeAllEmployee" method="get">
<%if(employeelist != null && !employeelist.isEmpty()) { %>
<table>
  <tr>
    <th>Emp Id</th>
    <th>Name</th>
    <th>Age</th>
    <th>Salary</th>
    <th>Designation</th>
    
  </tr>
  <% for(EmployeeInfoBeans employeeInfoBeans : employeelist) { %>
  <tr>
     <td><%=employeeInfoBeans.getEmpId() %>
     </td>
     <td><%=employeeInfoBeans.getEmpName() %>
     </td>
     <td><%=employeeInfoBeans.getAge() %>
     </td>
     <td><%=employeeInfoBeans.getSalary() %>
     </td>
     <td><%=employeeInfoBeans.getDesignation() %>
     </td>
  </tr>
  <%} %>
</table>
</form>
	</fieldset>

<%} %>

<%if(msg != null && !msg.isEmpty())  {%>
<h3 style="color:red;"> <%= msg %></h3>
<%} %>

</body>
</html>