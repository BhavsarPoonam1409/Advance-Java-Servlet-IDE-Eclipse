package com.example.revisiontwo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CheckData
 */
@WebServlet("/CheckData")
public class CheckData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckData() {
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
		
		String data = request.getParameter("s");
		Cookie[] c = request.getCookies();
		if(c!=null && c.length!=0) {
			String isLogin=c[3].getValue();
			if(isLogin.equals("poonam")) {
				response.sendRedirect("Dashboard");
				
			}
			else {
				if(data.equals("Sign_up")) {
					response.sendRedirect("signup.html");
				}
				else if(data.equals("Login")) {
					response.sendRedirect("login.html");
				}
			}
		}
		else {
			if(data.equals("Sign_up")) {
				response.sendRedirect("signup.html");
			}
			else if(data.equals("Login")) {
				response.sendRedirect("login.html");
			}
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
