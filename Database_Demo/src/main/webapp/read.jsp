<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
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
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/ajpdb","root","root");
String sql="SELECT * FROM student";

Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(sql);
while(rs.next())
{
	
	
	%>
	
	
	<table border="1" align="center" cellpadding="10">
	    <tr>
	        <th>Roll No</th>
	        <th>Student Name</th>
	        <th>Course</th>
	    </tr>
	
	    <%
	        while(rs.next())
	        {
	    %>
	
	    <tr>
	        <td><% out.print(rs.getInt(1)); %></td>
	        <td><% out.print(rs.getString(2)); %></td>
	        <td><% out.print(rs.getString(3)); %></td>
	    </tr>
	
	    <%
	        }
	    %>
	</table>	

	
<%
	 }
%>

</body>
</html>