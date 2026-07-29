package com.example.FirstProject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class writer
 */
@WebServlet("/writer")
public class writer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public writer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String n = request.getParameter("first");
		String s = request.getParameter("second");
		String e = request.getParameter("mail");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<h1 style='color:yellow; background-color:red; border:0.1cm solid dotted black;'> First Name: " + n + "</h1>");
		out.println("<h1 style='color:green;'> Second Name: " + s + "</h1>");
		out.println("<h1 style='color:green;'> Mail is: " + e + "</h1>");
          
		
		/*
		out.println("<h5 style=color:yellow; background-color:red; border:0.1cm; border-color:black;> First Name: "+ n + "</h5>");
		out.println("<h5 style=color:green> Second Name: "+ s + "</h5>");
		out.println("<h5 style=color:green> Mail is: " + e + "</h5>");
		*/
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
