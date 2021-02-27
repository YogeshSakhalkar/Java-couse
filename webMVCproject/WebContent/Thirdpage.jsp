<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%
		HttpSession s1= request.getSession();
	
		if(s1==null || s1.isNew()){
			response.sendRedirect("Login.jsp?errmsg='You must Log-in'");
	 	
		}
		else
		{
			User u1 = (User) s1.getAttribute("u1");
			
			out.print("<h1>Username is "+u1.getUsername());
			out.print("<h1>Password is "+u1.getCity());
		}
	%>
</body>
</html>