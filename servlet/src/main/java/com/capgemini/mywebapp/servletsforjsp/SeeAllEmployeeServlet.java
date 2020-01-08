package com.capgemini.mywebapp.servletsforjsp;

import java.io.IOException;
import java.security.Provider.Service;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.beans.EmployeeInfoBeans;
import com.capgemini.mywebapp.services.EmployeeServices;
import com.capgemini.mywebapp.services.EmployeeServicesImpl;
@WebServlet("/seeAllEmployee")
public class SeeAllEmployeeServlet extends HttpServlet {
private EmployeeServices service = new EmployeeServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	HttpSession sesssion = req.getSession();
	if(sesssion != null)
	{
		List<EmployeeInfoBeans> employeelist = service.getAllEmployees();
		if(employeelist !=null && !employeelist.isEmpty())
		{
			req.setAttribute("employeelist", employeelist);
			
		}else
		{
			req.setAttribute("msg", "There is No Employee Record  to display");
		}
		req.getRequestDispatcher("./seeAllEmployeeJsp.jsp").forward(req, resp);
		
	}else
	{
		req.setAttribute("msg", "please login first!");
		req.getRequestDispatcher("./loginForm").forward(req, resp);
	}
		
	}

	
}
