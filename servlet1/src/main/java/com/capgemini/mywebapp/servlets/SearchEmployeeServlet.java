package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.mywebapp.beans.EmployeeInfoBeans;
import com.capgemini.mywebapp.services.EmployeeServices;
import com.capgemini.mywebapp.services.EmployeeServicesImpl;

@WebServlet("/searchEmployee")
public class SearchEmployeeServlet extends HttpServlet{
	
	private EmployeeServices employeeServices = new EmployeeServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal=req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);
		EmployeeInfoBeans employeeBeans = employeeServices.searchEmployee(empId);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(employeeBeans != null)
		{
		out.println("<h3> EmployeeId" +empId+ "found-</h3>");
		out.println("Name :" +employeeBeans.getEmpName());
		out.println("<br> Age: " +employeeBeans.getAge());
		out.println("<br> Salary: " +employeeBeans.getSalary());
		out.println("<br> Designation: " +employeeBeans.getDesignation());
		
		
		}else
		{
			out.println("<h3> style = 'color:red'> Employee Id" +empId + "Not found!</h3>");
		}
		out.println("</body>");
		out.println("</html>");
		
	
	}

}
