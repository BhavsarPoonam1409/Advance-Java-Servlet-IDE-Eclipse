package com.example.revision1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SuccessServlet
 */
@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<body style='background-color:lightyellow;'>");
		//out.println("<h1 style='color:hotpink; text-align:center;'>Welcome to my website</h1>");

		
//
//		out.println("<h2 style=color:blue; >Students Data:- </h2>");
//		out.println("<hr>");
//		out.println("<hr>");
//		
//		out.println("<hr>");
//		ServletContext context = request.getServletContext();
//		String clgName = context.getInitParameter("collegeName");
//		String clgWeb = context.getInitParameter("collegeWebsite");
//		out.println("<h3> College name is: "+clgName+"</h3>");
//		out.println("<h3>College website is: "+clgWeb+"</h3>");
//		
//		out.println("<hr>");
		
		//combine page
		RequestDispatcher dispatch = request.getRequestDispatcher("HeaderServlet");
		dispatch.include(request, response);

		String stuname = request.getParameter("stuname");
		String enroll = request.getParameter("enroll");
		String course = request.getParameter("course");
		String email = request.getParameter("email");
		
		out.println("<h4>Student name is: "+stuname+"</h4>");
		out.println("<h4>Enrollment no is: "+enroll+"</h4>");
		out.println("<h4>course is: "+course+"</h4>");
		out.println("<h4>Email is: "+email+"</h4>");
		
		out.println("<hr>");
		
		String admin = request.getAttribute("admin").toString();
		String dept = request.getAttribute("dept").toString();

		out.println("<h2>Admin : " + admin + "</h2>");
		out.println("<h2>Department : " + dept + "</h2>");
		
		RequestDispatcher dispatc = request.getRequestDispatcher("FooterServlet");
		dispatc.include(request, response);

		

		
		
//		out.println("<hr>");
//		out.println("<h1 style='color:hotpink; text-align:center;'>Thank yuh for visiting us.</h1>");
//		out.println("<hr>");
//		
//		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
