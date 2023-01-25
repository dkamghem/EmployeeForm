<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body>
<form action="RegisterServlet" method="post">
	ID<input type="text" name="id"/><br/>
	Name<input type="text" name="ename"/><br/>
	Department<input type="text" name="edept"/><br/>
	Salary<input type="text" name="esalary"/><br/>
	
	<input type="submit" value="Submit" />
	
</form>
</body>
</html>