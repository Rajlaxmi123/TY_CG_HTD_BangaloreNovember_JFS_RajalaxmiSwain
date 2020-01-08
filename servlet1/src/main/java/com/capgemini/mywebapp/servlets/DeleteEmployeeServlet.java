package com.capgemini.mywebapp.servlets;

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

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {
	private EmployeeServices service = new EmployeeServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		HttpSession session = req.getSession(false);
		if(session !=null)
		{
			int empId = Integer.parseInt(req.getParameter("empId"));
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if(service.deleteEmployee(empId))
			{


				out.println("<h3 styele='color: red'>Employee Record for " +empId + "Deleted!</h3>");

			}else
			{
				out.println("<h3 style='color: red'>Employe Id " +empId + "nOT fOUND!</h3>");
			}



			out.println("</html>");
			out.println("</body>");

			req.getRequestDispatcher("./deleteEmpForm.html").include(req, resp);
		}else
		{//invalid session
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style='color:red'>Please Login First!</h3>");
			out.println("</html>");
			out.println("</body>");
			
			req.getRequestDispatcher("./loginPage.html").include(req, resp);
		}

	}

}
