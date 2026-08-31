package com.example.revision1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet(
		urlPatterns = { "/RegistrationServlet" }, 
		initParams = { 
				@WebInitParam(name = "adminName", value = "Poonam"), 
				@WebInitParam(name = "department", value = "GUCPC")
		})
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		ServletConfig config = getServletConfig();
//		String n = config.getInitParameter("adminName");
		
		
		String stuname = request.getParameter("stuname");
		String enroll = request.getParameter("enroll");
		String course = request.getParameter("course");
		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
//		out.println("<p>Student name is: "+stuname+"</p>");
//		out.println("<p>Enrollment no is: "+enroll+"</p>");
//		out.println("<p>course is: "+course+"</p>");
//		out.println("<p>Email is: "+email+"</p>");
//		
//		
//		
		response.setContentType("text/html");
		ServletContext context = request.getServletContext();
//		String clgName = context.getInitParameter("collegeName");
//		String clgWeb = context.getInitParameter("collegeWebsite");
//		out.println("<h2>clg name: "+clgName+"</h2");
//		out.println("<h2> clg website: "+clgWeb+"</h2>");
//		
//		
		ServletConfig config = getServletConfig();
		String admin =config.getInitParameter("adminName");
		String dept =config.getInitParameter("department");
		
		request.setAttribute("admin", admin);
		request.setAttribute("dept", dept);
		
//		out.println("<h2> admin name: "+admin+"</h2>");
//		out.println("<h2> department name: "+dept+"</h2>");
		
		if(stuname.equals("") || enroll.equals("")) {
			RequestDispatcher disptacher = request.getRequestDispatcher("ErrorServlet");
			disptacher.forward(request,response);
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("SuccessServlet");
			dispatcher.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
