<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Welcome to LearnersAcademy</h1>
<h3>Please login to continue</h3>

	<h2>Try logging in</h2>
	<form action = "login" method = "post"> 
		User Name <input type = "text" name = "username"/>
		Password <input type = "password" name = "password"/>			
		<input type = "submit" value = "login"/> 	
	</form>		
	<span style ="color:red"> ${errorMessage}</span><br/>
</body>
</html>