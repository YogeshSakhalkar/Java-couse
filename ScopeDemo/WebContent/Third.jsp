<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	//HttpSession sess=request.getSession();
	//Product p1=(Product) sess.getAttribute("p1");
	//out.print("<h2>ThirdPage "+p1.getTitle()+"</h2>");
%>

<jsp:useBean id="p1" class="model.Product" scope="request"></jsp:useBean>
<h3>Third page</h3><jsp:getProperty property="title" name="p1"/>
</body>
</html>