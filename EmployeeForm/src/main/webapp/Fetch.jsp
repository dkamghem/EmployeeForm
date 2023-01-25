<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "java.util.*, com.demo.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body><center>

	<%
	List<Employee> elist=(ArrayList<Employee>)request.getAttribute("result");	
	%>
	<table border="1" bgcolor="red">
		<tr>
			<th>EMP ID</th>
			<th>Name</th>
			<th>Dept</th>
			<th>Salary</th>
		</tr>
		<%
		for (int i = 0; i < elist.size(); i++) {
			Employee e = elist.get(i);
		%>
		<tr>
			<td>&nbsp;<%=e.getId()%>&nbsp;
			</td>
			<td>&nbsp;<%=e.getName()%>&nbsp;
			</td>
			<td>&nbsp;<%=e.getDept()%>&nbsp;
			</td>
			<td>&nbsp;<%=e.getSalary()%>&nbsp;
			</td>
		</tr>
		<% 
		}
		%>
	</table>

</body>
</html>