package com.example.FirstProject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Novell_Form
 */
@WebServlet("/Novell_Form")
public class Novell_Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Novell_Form() {
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
		
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		String city = request.getParameter("city");
		String emp = request.getParameter("emp");
		String server = request.getParameter("web");
		String role = request.getParameter("r");
		
		//checkbox
		String mail = request.getParameter("mail");
		String pay = request.getParameter("payroll");
		String self = request.getParameter("slef");
		
		out.println("username is:"+username);
		out.println("password is:"+pass);
		out.println("city is:"+city);
		out.println("employeement is:"+emp);
		out.println("web server is:"+server);
		out.println("role is:"+role);
		
		//checkbox
		if(mail!=null && mail.equals("on")) {
			out.println("you are signed for mail");
		}
		if(pay!=null && pay.equals("on")) {
			out.println("you are signed for pay");
		}
		if(self!=null && self.equals("on")) {
			out.println("you are signed for self");
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
