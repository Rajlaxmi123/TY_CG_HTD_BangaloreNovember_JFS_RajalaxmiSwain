package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.beans.EmployeeInfoBeans;
import com.capgemini.mywebapp.services.EmployeeServices;
import com.capgemini.mywebapp.services.EmployeeServicesImpl;
@WebServlet("/updateEmployee2")
public class UpdateEmployeeServlet2 extends HttpServlet {
	private EmployeeServices service = new EmployeeServicesImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		if(session !=null)
		{
			
		
			//Get the form data
			int empId = Integer.parseInt(req.getParameter("empId"));
			String name =req.getParameter("name");
			String ageVal = req.getParameter("age");
			String salaryVal = req.getParameter("salary");
			String designation = req.getParameter("designation");
			String password = req.getParameter("password");
			
			
			EmployeeInfoBeans employeeInfoBeans = new EmployeeInfoBeans();
			employeeInfoBeans.setEmpId(empId);
			employeeInfoBeans.setEmpName(name);
			if(ageVal !=null && !ageVal.isEmpty())
			{
				int age = Integer.parseInt(ageVal);
				employeeInfoBeans.setAge(age);
			}
		
			if(salaryVal !=null && !salaryVal.isEmpty())
			{
				double salary = Double.parseDouble(salaryVal);
				employeeInfoBeans.setSalary(salary);
			}
			
			employeeInfoBeans.setDesignation(designation);
			employeeInfoBeans.setPassword(password);
			boolean isUpdated=service.updateEmployee(employeeInfoBeans);
		if(isUpdated) {	
req.setAttribute("msg","Record for Employee Details Updated!" );
			req.getRequestDispatcher("./updateEmpJspForm.jsp").forward(req, resp);
		}else
		req.setAttribute("msg", "Employee Details Not Found !");
		}else
		{//invalid session
			
			req.setAttribute("msg","Please Login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);;
		}
		
		
		
	}
	
	
}
