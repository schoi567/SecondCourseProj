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

<h1 style="text-align: center;">Following are the list of all information about subjects </h1>
<table border="1", align = center>
<tr>
<td>Subjectid</td>
<td>Subjectname</td>
</tr>
<%
try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LearnersAcademy1", "root", "12345678");
statement=connection.createStatement();
String sql = "SELECT * FROM subject";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("SubjectID") %></td>
<td><%=resultSet.getString("SubjectName") %></td>

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