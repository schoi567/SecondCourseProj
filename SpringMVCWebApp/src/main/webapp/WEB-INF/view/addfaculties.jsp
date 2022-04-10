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

<h1>Following are the list of all information about all the tables <h1>
<h2>(Please refer to each column's id and name for reference) </h2>


<table border="1" style="width:25%; float:left">
<caption style="font-weight:bold">Table for classes' id and name</caption>
<tr>
  <td width = auto, style="vertical-align: top"> classid </td>
  <td width = auto, style="vertical-align: top">classname </td>
</tr>

<%
try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LearnersAcademy1", "root", "12345678");
statement=connection.createStatement();
String sql = "SELECT * FROM classes";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("classid") %></td>
<td><%=resultSet.getString("classname") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table> 

<table border="1" style="width:25%; float:left">
<caption style="font-weight:bold">Table for students' id and name</caption>
<tr>
  <td width = auto, style="vertical-align: top"> studentid </td>
  <td width = auto, style="vertical-align: top"> studentname </td>
</tr>

<%
try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LearnersAcademy1", "root", "12345678");
statement=connection.createStatement();
String sql = "SELECT * FROM student";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("StudentID") %></td>
<td><%=resultSet.getString("StudentName") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table> 



<table border="1" style="width:25%; float:right">
<caption style="font-weight:bold">Table for subjects' id and name</caption>
<tr>
  <td width = auto, style="vertical-align: top"> subjectid </td>
  <td width = auto, style="vertical-align: top">subjectname </td>
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

<table border="1" style="width:25%;  align:right">
<caption style="font-weight:bold">Table for faculties' id and name</caption>
<tr>
  <td width = auto, style="vertical-align: top"> facultyid </td>
  <td width = auto, style="vertical-align: top"> facultyname </td>
</tr>

<%
try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LearnersAcademy1", "root", "12345678");
statement=connection.createStatement();
String sql = "SELECT * FROM faculty";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("FacultyID") %></td>
<td><%=resultSet.getString("FacultyName") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table> 

<br style = "line-height:63;">

<br>
<h1>Please type in facultyid and facultyname you would like to add.</h1>
<h2>In order to register a faculty to class, please to go to ""Add Classes & Show Individual Tables".</h2>
<form method="post" action="addfaculty">
Facultyid:<br>
<input type="text" name="Facultyidtoadd">
<br>
Facultyname:<br>
<input type="text" name="Facultynametoadd">
<br>
<input type="submit" value="addFaculty">
<br>
</form>

<h1 >Please type in Facultyid to delete.</h1>

<form method="post" action="deletefaculty">
Facultyid:<br>
<input type="text" name="Facultyidtodelete">
<br>
<input type="submit" value="deleteFaculty">
</form>




</body>
</html>