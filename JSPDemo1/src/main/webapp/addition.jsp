<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	//declaration tag
	<%! int no1,no2,sum; 
		int total(int n1,int n2){
			int sum = n1+n2;
			return sum;
		}
	
	%>
	
	<%
		
		no1 = Integer.parseInt(request.getParameter("no1"));
		no2 = Integer.parseInt(request.getParameter("no2"));
		
		sum=total(no1,no2);
		
		
		//out.println("sum is: "+sum);
	%>
	
	<%--poonam bhavsar --%>
	
	
	<h1>sum is: <%= sum %></h1>
</body>
</html>