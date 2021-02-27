<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String city;

%>
<%-- html code
	above declaration and below scriplet is connected --%>
<%
	city="Margao";
	String name;
	name="Yogesh D Sakhalkar";
	out.print("<h1>"+name);
%>
<%= 2*2%>
</body>
</html>