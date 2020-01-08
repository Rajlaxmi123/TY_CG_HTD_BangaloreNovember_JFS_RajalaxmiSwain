package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.services.EmployeeServices;
import com.capgemini.mywebapp.services.EmployeeServicesImpl;

@WebServlet("/deleteEmployee2")
public class DeleteEmployeeServlet2 extends HttpServlet {

	private EmployeeServices service = new EmployeeServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		HttpSession session = req.getSession(false);
		if(session !=null)
		{
			int empId = Integer.parseInt(req.getParameter("empId"));
		
			boolean isDeleted=service.deleteEmployee(empId);
		if(isDeleted) {	
req.setAttribute("msg","Record for Employee Id" +empId + "Deleted!" );
			req.getRequestDispatcher("./deleteEmpJspForm.jsp").forward(req, resp);
		}else
		req.setAttribute("msg", "Employee Id" +empId + "Not Found !");
		}else
		{//invalid session
			
			req.setAttribute("msg","Please Login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);;
		}

		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
