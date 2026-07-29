package com.example.redirection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
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
		
		String user = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if(user.equals(pass) ) {
			//out.println("welcome to the my page");
			RequestDispatcher dispatch = request.getRequestDispatcher("Dashboard");
			dispatch.forward(request,response);
			//dispatch.sendRedirect("Dashboard");
		}
		
		else {
			//response.sendRedirect("index.html");
			RequestDispatcher dispatch = request.getRequestDispatcher("index.html");
			out.println("Invaild user");
			dispatch.include(request, response);
		}
		
		//servelt to html file jane ke liye
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
