package com.example.Question1_Assignment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
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
		
		String enroll = request.getParameter("eroll");
		int roll = Integer.parseInt(enroll);
		String sname = request.getParameter("sname");
		String course = request.getParameter("course");
	
		out.println("<html>");
		out.println("<h2 style=color:blue;>Student Details</h2>");
		out.println("<table border='1'>");

		out.println("<tr>");
		out.println("<th>Enrollment No.</th>");
		out.println("<th>Student Name</th>");
		out.println("<th>Course</th>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>" + roll + "</td>");
		out.println("<td>" + sname + "</td>");
		out.println("<td>" + course + "</td>");
		out.println("</tr>");

		out.println("</table>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
