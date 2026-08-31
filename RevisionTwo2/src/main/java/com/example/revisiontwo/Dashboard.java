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
 * Servlet implementation class Dashboard
 */
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashboard() {
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
		
//		out.println("Welcome to my dashboard");
	
		Cookie[] c = request.getCookies();
//		System.out.println(c.toString());
//		System.out.println(c[0].getValue());
//		System.out.println(c[1].getValue());
//		
		//cookie in browser
		out.println("Email ID: "+c[0].getValue());
		out.println("Full Name : "+c[1].getValue());
		
		out.println("password: "+c[3].getValue());
		out.println("<button type='submit'>click me<button>");
		
		out.print("<form action='Logout'> <input type='submit' value='Logout'> </form>");
		
		//out.println("Welcome to my dashboard" + c[0].getValue());  //cookies mese data lene ke liye
		
		//cookie se multiple data lene ke liye getcookie() method
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
