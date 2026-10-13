package com.example.question2_assignment;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CollegeServlet
 */
@WebServlet(
		urlPatterns = { "/CollegeServlet" }, 
		initParams = { 
				@WebInitParam(name = "collegeName", value = "GUCPC"), 
				@WebInitParam(name = "department", value = "Software Department")
		})
public class CollegeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollegeServlet() {
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
		ServletConfig config = getServletConfig();
		
		String collegeName = config.getInitParameter("collegeName");
		String department = config.getInitParameter("department");
		
		out.println("<html>");
		out.println("<h2 style=color:blue;>College Details:-</h2>");
		out.println("College Name is: "+collegeName+ "<br>"+"<br>");
		out.println("Department Name is: "+department);
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
