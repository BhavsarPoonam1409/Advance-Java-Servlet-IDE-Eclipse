package com.example.revision1;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HeaderServlet
 */
@WebServlet("/HeaderServlet")
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeaderServlet() {
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
		out.println("<h1 style='color:hotpink; text-align:center;'>Welcome to my website</h1>");

		
		
		out.println("<h2 style=color:blue; >Students Data:- </h2>");
		out.println("<hr>");
		
		
		out.println("<hr>");
		ServletContext context = request.getServletContext();
		String clgName = context.getInitParameter("collegeName");
		String clgWeb = context.getInitParameter("collegeWebsite");
		out.println("<h3> College name is: "+clgName+"</h3>");
		out.println("<h3>College website is: "+clgWeb+"</h3>");
		
		out.println("<hr>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
