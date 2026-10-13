package com.example.question3_assignment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

		    String eroll = request.getParameter("eroll");
		    String name = request.getParameter("sname");
		    
		    Cookie c1 = new Cookie("eroll", eroll);
		    c1.setMaxAge(60*60*24*7);
		    response.addCookie(c1);
		    
		    Cookie c2 = new Cookie("sname", name);
		    c2.setMaxAge(60*60*24*7);
		    response.addCookie(c2);

		    out.println("<h2>Login Successful!</h2>");
		    out.println("<br><br>");
		    out.println("<a href='ProfileServlet'>View Profile</a>");
		  
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
