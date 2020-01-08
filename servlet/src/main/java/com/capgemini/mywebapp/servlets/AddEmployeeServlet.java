package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.beans.EmployeeInfoBeans;
import com.capgemini.mywebapp.services.EmployeeServices;
import com.capgemini.mywebapp.services.EmployeeServicesImpl;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet{

	private EmployeeServices service = new EmployeeServicesImpl() ;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		HttpSession session = req.getSession(false);
		
		if(session != null)
		{//valid session
			//Get the form data
			int empId = Integer.parseInt(req.getParameter("empId"));//empId present in the addempform html
			String name =req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			double salary = Double.parseDouble(req.getParameter("salary"));
			String designation = req.getParameter("designation");
			String password = req.getParameter("password");
			
			
			EmployeeInfoBeans employeeInfoBeans = new EmployeeInfoBeans();
			employeeInfoBeans.setEmpId(empId);
			employeeInfoBeans.setEmpName(name);
			employeeInfoBeans.setAge(age);
			employeeInfoBeans.setSalary(salary);
			employeeInfoBeans.setDesignation(designation);
			employeeInfoBeans.setPassword(password);
			
			boolean isAdded = service.addEmployee(employeeInfoBeans);
			
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if(isAdded) {
				out.println("<h3 style='color: green'>Employee Added Successfully!..</h3>");
				
				
			}else
			{
				out.println("<h3 style='color: red'>Unable to add employee..</h3>");
			}
			
			out.println("</html>");
			out.println("</body>");
			req.getRequestDispatcher("./addEmpForm.html").include(req, resp);
			
		}else {//invalid session
			
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style='color: red'>Please Login First!..</h3>");
			out.println("</html>");
	out.println("</body>");
	
	
	req.getRequestDispatcher("./loginPage.html").include(req, resp);
	}
}
}
