<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align = center>Please select options from below</h1>


	<form action = "tables" method = "post" style="text-align: center;"> 	
     Show All Tables <button type = "submit" name = "alltables"> Request </button>
	</form>	
	<br/>	
	<form action = "classesstudents" method = "post" style="text-align: center;"> 	
	Show Classes & Students<br> (All the listings for other tables have to to through Classes) 
	<button type = "submit" name = "cstable"> Request </button>
	</form>	
    <br/>
	
	<form action = "classesfaculties" method = "post" style="text-align: center;"> 	
	Show Classes & Faculties <button type = "submit" name = "cftable"> Request </button>
	</form>	
    <br/>
	
	<form action = "classessubjects" method = "post" style="text-align: center;"> 	
	Show Classes & Subjects <button type = "submit" name = "csutable"> Request </button>
	</form>	
    <br/>
		
	
    <form action = "addclasses" method = "post" style="text-align: center;"> 	
	Control Classes & Show Individual Tables <button type = "submit" name = "addcl"> Request </button>
    </form>	
     <br/>
    
    
     <form action = "addsubjects" method = "post" style="text-align: center;"> 	
	Control Subjects & Show Individual Tables <button type = "submit" name = "addfc"> Request </button>
    </form>	
     <br/>
    
    <form action = "addstudents" method = "post" style="text-align: center;"> 	
	Control Students & Show Individual Tables <button type = "submit" name = "addst"> Request </button>
    </form>	
     <br/>
     
	 <form action = "addfaculties" method = "post" style="text-align: center;"> 	
	Control Faculties & Show Individual Tables <button type = "submit" name = "addfc"> Request </button>
    </form>	




</body>
</html>