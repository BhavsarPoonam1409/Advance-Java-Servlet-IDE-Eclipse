<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		String name = request.getParameter("name");
		String course = request.getParameter("course");
		//communicatate with database so use driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajpdb","root","root");
		
		String sql = "INSERT INTO student VALUES("+rollno+",'"+name+"','"+course+"')";
		//String sql = "INSERT INTO student (rollno,sname) VALUES("+rollno+",'"+name+"')";
		
		Statement stmt = con.createStatement();
		
		//boolean isOk = stmt.execute(sql);
		//if(isOk){
			//out.print("Data added successfully");
		//}
		//else{
			//out.print("Error");
		//}	
		//sql query insert
		
		int row = stmt.executeUpdate(sql);
		if(row>0){
			out.println("successfully data added");
		}
		else{
			out.println("error"); //table ka name galt deh diiya student1 toh error aayega
		}
		
		
	%>
	
	
	
	
	
</body>
</html>