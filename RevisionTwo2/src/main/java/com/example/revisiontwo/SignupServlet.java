package com.example.revisiontwo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String full = request.getParameter("full");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		
		Cookie c1 = new Cookie("email",email);
		c1.setMaxAge(60*60*24*7);
		response.addCookie(c1);
		
		
		Cookie c2 = new Cookie("full_name",full);
		c2.setMaxAge(60*60*24*7);
		response.addCookie(c2);
		
		Cookie c3 = new Cookie("isLogin","poonam");  //static cookie
		c3.setMaxAge(60*60*24*7);
		response.addCookie(c3);
		
		Cookie c4 = new Cookie("password",pwd);
		c4.setMaxAge(60*60*24*7);
		response.addCookie(c4);
		
		response.sendRedirect("Dashboard");
		
		//cookie mese data eke dashboard me print krege
		//signup se dahboard pe leh jane ke liye 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
