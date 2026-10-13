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
    <title>Student Records</title>
</head>

<body align="center" bgcolor="lightyellow">

    <h1>Student Records</h1>

    <%
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college_db",
            "root",
            "root"
        );

        String sql = "SELECT * FROM student";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
    %>
	<table border="1" align="center" cellpadding="10">
		<tr>
            <th>Enrollment No</th>
            <th>Student Name</th>
            <th>Course</th>
            <th>Semester</th>
        </tr>

        <% while(rs.next()){%>
		<tr>
            <td><% out.print(rs.getInt(1)); %></td>
            <td><% out.print(rs.getString(2)); %></td>
            <td><% out.print(rs.getString(3)); %></td>
            <td><% out.print(rs.getInt(4)); %></td>
        </tr>

        <% } %>
	</table>
	<br><br>
	<a href="index.html">Back to Student Form</a>

</body>
</html>
