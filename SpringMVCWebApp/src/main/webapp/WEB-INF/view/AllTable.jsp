<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306";
String database = "LearnersAcademy1";
String userid = "root";
String password = "12345678";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align: center;">Following are the list of all information about all the tables </h1>
<table border="1", align = center>
<tr>
<td>Classid</td>
<td>Classname</td>
<td>Subjectid</td>
<td>Subjectname</td>
<td>Facultyid</td>
<td>Facultyname</td>
<td>Studentid</td>
<td>Studentname</td>
</tr>
<%
try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LearnersAcademy1", "root", "12345678");
statement=connection.createStatement();
String sql = "SELECT * FROM all_table";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("classid") %></td>
<td><%=resultSet.getString("classname") %></td>
<td><%=resultSet.getString("subjectid") %></td>
<td><%=resultSet.getString("subjectname") %></td>
<td><%=resultSet.getString("facultyid") %></td>
<td><%=resultSet.getString("facultyname") %></td>
<td><%=resultSet.getString("studentid") %></td>
<td><%=resultSet.getString("studentname") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table> 
</body>
</html>