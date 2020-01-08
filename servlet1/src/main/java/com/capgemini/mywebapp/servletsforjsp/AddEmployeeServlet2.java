package com.capgemini.mywebapp.servletsforjsp;

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

@WebServlet("/addEmployee2")
public class AddEmployeeServlet2 extends HttpServlet{

	
	private EmployeeServices service = new EmployeeServicesImpl() ;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		HttpSession session = req.getSession(false);
		
		if(session != null)
		{//valid session
			//Get the form data
			int empId = Integer.parseInt(req.getParameter("empId"));
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
			if(isAdded)
			{
			
			req.setAttribute("msg"," Employee Details added");
			
			}else
			{
				req.setAttribute("msg", "Details not Added properly !");
			}
			
			req.getRequestDispatcher("./addEmpJspForm.jsp").forward(req, resp);
			}else {//invalid session
			
			req.setAttribute("msg","Please Login First");
	
	
	req.getRequestDispatcher("./loginForm").forward(req, resp);;
	
	
	
	
		}

	}
}
