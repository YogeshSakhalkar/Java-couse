<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<h3>we are on jsp page now</h3>
<form action="nextPage" >
Enter the username <input type="text" name="myid" />
<br/>
Enter the password <input type="password" name="pass" />
<br/>
<input type="submit" value="submit data to server"/>
</form>
<%--this below will do all the work which is commented below and this is expression language --%>
	${param.errmsg }
<%--
	String var_errmsg=request.getParameter("errmsg");
	if(var_errmsg!=null)
	out.print(var_errmsg);
--%>
</body>
</html>