package com.example.FirstProject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ArithmeticOperation
 */
@WebServlet("/ArithmeticOperation")
public class ArithmeticOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArithmeticOperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String no1 = request.getParameter("first");
		String no2 = request.getParameter("second");
		int n1 = Integer.parseInt(no1);
		int n2 = Integer.parseInt(no2);
		
		String ans = request.getParameter("ans");
		PrintWriter out = response.getWriter();
		if(ans.equals("+")) {
			int add = n1 + n2;
			out.println("Addition is:" + add);
		}
		else if(ans.equals("-")) {
			int sub = n1 - n2;
			out.println("Subtraction is:" + sub);
		}
		
		else if(ans.equals("*")) {
			int mul = n1 * n2;
			out.println("Multification is:" + mul);
		}
		
		else {
			int div = n1 / n2;
			out.println("Divistion is:" + div);
		}
		
	
		
		//example = value = student ka name
		
		//System.out.println("First Name: "+ no1);
		//System.out.println("Second Name: "+ no2);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
