package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.beans.EmployeeInfoBeans;
import com.capgemini.mywebapp.services.EmployeeServices;
import com.capgemini.mywebapp.services.EmployeeServicesImpl;

@WebServlet("/searchEmployee3")
public class GetEmployeeServlet extends HttpServlet {
	
	private EmployeeServices service =  new EmployeeServicesImpl();
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session = req.getSession(false);
	if(session !=null)
	{
		int empId = Integer.parseInt(req.getParameter("empId"));
	EmployeeInfoBeans employeeInfoBeans =	service.searchEmployee(empId);
	req.setAttribute("employeeInfoBeans", employeeInfoBeans);
	req.getRequestDispatcher("./searchEmpJspForm.jsp").forward(req, resp);
		
	}else
	{
		req.setAttribute("msg", "Please Login First");
		req.getRequestDispatcher("./loginForm").forward(req, resp);
	}
	
	
}
	
}
