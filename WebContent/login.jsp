<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login here</title>
	<link rel="stylesheet" type="text/css" href="design/design.css"> 
</head>
<body>
	<jsp:include page="design/header.jsp" />
	<% String message = (String)(request.getAttribute("message")); %>

	<form name="loginform" action="loginservlet" method="post" >
		<h1 id="h">Login Here</h1>
		<label>Email:</label> <input  type="text" name="email" /> <br>
		<br>
		<label>Password:</label> <input  type="password" name="password" /> <br>
		<span style = "color:red; font-size:13px;" id = "td2"><%=message %></span>
		<br>
		<input type="submit" value="Login" /><br>
		<br>
		<a href="register.jsp">Don't have an account? </a>
	</form>
	<br>
	<br>
	<jsp:include page="design/footer.jsp" />
</body>
</html>