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

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet{
	private EmployeeServices service = new EmployeeServicesImpl();
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//get the form data
	int empId=Integer.parseInt(req.getParameter("empId"));
	String password = req.getParameter("password");
	//validate
	
	EmployeeInfoBeans employeeInfoBeans =service.authenticate(empId, password);
	if(employeeInfoBeans != null)
	{
		HttpSession session =  req.getSession(true);
		session.setAttribute("employeeInfoBeans", employeeInfoBeans);
		session.setMaxInactiveInterval(60);//after 60 seconds it will get logout by its own
		req.getRequestDispatcher("./homePageJsp.jsp").forward(req, resp);
		
	}else
	{//if user not logged in // it will come to invalid credentials
		req.setAttribute("msg", "Invalid credentials !");//invalid credentials kis the message what u want to displY//set the msg inside attribute inside the jsp file
		req.getRequestDispatcher("./loginForm").forward(req, resp);//we have forwarded ..so when the request will go ,
		//it will go along with the request too.we dmnt need to use include here
		
		
		
	}
	
	
}
	
}
