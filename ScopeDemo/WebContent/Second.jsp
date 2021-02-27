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
	//String mytitle = request.getParameter("title");
	//Product p1 = new Product();
	//p1.setTitle(mytitle);
	//out.print("<h2>Second page :" +p1.getTitle()+"</h2>");
	
	//HttpSession sess = request.getSession();
	//sess.setAttribute("p1", p1);
%>
<h3>Second Page Using UseBean</h3>
<jsp:useBean id="p1" class ="model.Product" scope="request"></jsp:useBean>
<jsp:setProperty property="title" name="p1" value='<%= request.getParameter("title") %>'/>
<jsp:getProperty property="title" name="p1"/>
<jsp:include page="Third.jsp"></jsp:include>

<!--  <a href="Third.jsp">Third Page</a> -->
</body>
</html>