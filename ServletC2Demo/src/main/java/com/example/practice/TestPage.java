package com.example.practice;

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
 * Servlet implementation class TestPage
 */
@WebServlet(
		urlPatterns = { "/TestPage" }, 
		initParams = { 
				@WebInitParam(name = "Username", value = "Poonam"), 
				@WebInitParam(name = "Lastname", value = "Bhavsar")
		})
public class TestPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ServletConfig config = getServletConfig();
		String u = config.getInitParameter("Username");
		String l = config.getInitParameter("Lastname");
		
		System.out.println("Username is: "+u);
		System.out.println("Lastname is: "+l);
		
		PrintWriter out = response.getWriter();
		
		out.println("Username is: "+u);
		out.println("Lastname is: "+l);
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
