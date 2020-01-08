package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id1= req.getParameter("id1");
		
		//get the querry string
//	String id1Val= req.getParameter("id1");
//	ServletContext context = getServletContext();
//	String contextParamVal = context.getInitParameter("myContextParam");
//	
//	ServletConfig config = getServletConfig();
//	String configParamVal=config.getInitParameter("myConfigParam");
	

	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("EmployeeId" +id1);
	//out.println("EmployeeId" +id1Val);
	out.println("Name=Rajlaxmi");
	out.println("Salary=879799");
//	out.println("<br><br>Context Param Value = "+contextParamVal );
//	out.println("<br><br>Context Param Value = "+configParamVal );
	out.println("</body>");
	out.println("</html>");
	
	}

}
