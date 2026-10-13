<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Add Student Data</title>
</head>

<body align="center" bgcolor="lightyellow">

<%
    int enrollment_no = Integer.parseInt(request.getParameter("enrollment_no"));
	String student_name = request.getParameter("student_name");
	String course = request.getParameter("course");
	int semester = Integer.parseInt(request.getParameter("semester"));

    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/college_db",
        "root",
        "root"
    );

    String sql = "INSERT INTO student VALUES("+ enrollment_no + ",'"+ student_name + 
    		"','"+ course + "',"+ semester + ")";

    Statement stmt = con.createStatement();
	int row = stmt.executeUpdate(sql);

    if(row > 0)
    {
        out.println("<h2>Student Data Added Successfully!</h2>");
    }
    else
    {
        out.println("<h2>Error in Adding Data</h2>");
    }
%><br><br>
	
	<a href="index.html">Back to Student Form</a>
	<br><br>
	
	<a href="read.jsp">View All Student Records</a>

</body>
</html>

