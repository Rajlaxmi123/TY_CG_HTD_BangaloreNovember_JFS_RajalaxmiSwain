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

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	private EmployeeServices service = new EmployeeServicesImpl() ;


		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			//Get the Form Data

			String empIdVal  =	req.getParameter("empId");
			String password = req.getParameter("password");
			int empId = Integer.parseInt(empIdVal);

			EmployeeInfoBeans employeeInfoBeans = service.authenticate(empId, password);
			PrintWriter out =resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if(employeeInfoBeans !=null)
			{//valid credentials
				HttpSession session = req.getSession(true);
				session.setAttribute("employeeInfoBeans",employeeInfoBeans);
				out.println("<h2 style='color: blue'>Welcome" +employeeInfoBeans.getEmpName() +"!</h2>");
				out.println("<br><a href='./addEmpForm.html'>Add Employee</a>");
				out.println("<br><a href='#'>Update Employee</a>");
				out.println("<br><a href='./deleteEmpForm.html'>Delete Employee</a>");
				out.println("<br><a href='./searchEmp.html'>Search Employee</a>");
				out.println("<br><a href='#'>See AllEmployee</a>");
				out.println("<br><a href='./logout'>Logout</a>");


			}

			else
			{ //invalid credentials
				out.println("<h3 style='color:red'>Invalid Credentials</h3>");
				req.getRequestDispatcher("./loginPage.html").include(req, resp);
			}

			out.println("</html>");
			out.println("</body>");








		}

	
		}






	


	
