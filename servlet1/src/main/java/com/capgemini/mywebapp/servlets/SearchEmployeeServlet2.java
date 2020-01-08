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

@WebServlet("/searchEmployee2")
public class SearchEmployeeServlet2 extends HttpServlet{
	private EmployeeServices employeeServices = new EmployeeServicesImpl();

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//validate the session
		
	HttpSession session =	req.getSession(false);//false so that it returns null if user not logged in
	//null means if user is logged in we will get that same session object that is created once else it will return null
	//if it is given true , it will create new session if not created before , else will show the previously created object
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	
	
	
	if(session !=null)
	{//valid session
		
	String empIdVal2	=req.getParameter("empId");
	int empId = Integer.parseInt(empIdVal2);
	
		EmployeeInfoBeans employeeBeans = employeeServices.searchEmployee(empId);
		if(employeeBeans != null)
		{
		out.println("<h3> EmployeeId" +empId+ "found-</h3>");
		out.println("Name :" +employeeBeans.getEmpName());
		out.println("<br> Age: " +employeeBeans.getAge());
		out.println("<br> Salary: " +employeeBeans.getSalary());
		out.println("<br> Designation: " +employeeBeans.getDesignation());
		
		
		}else
		{
			out.println("<h3> style = 'color:red'> Employee Id" +empId + "Nopt found!</h3>");
		}
		
		
		
		
		
	}else
	{//invalid session
		
		
		out.println("Please Login First!");
		req.getRequestDispatcher("./loginPage.html").include(req, resp);
		
		
	}
		
		
		
	out.println("</html>");
	out.println("</body>");
			
	}
	
	
}








