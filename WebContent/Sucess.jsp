<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="design/design.css"> 
	<title>HomeSwopHome </title>
</head>
<body>

<header>
	<ul>
		<li id="logo" ><a href="index.jsp"><img src="images/logo.png"/></a></li>
		<li><a href="">Guide</a></li>
		<li><a href="index.jsp">Homes</a></li>
		<li><a href="personal_Info.jsp">Profile</a></li>
		<li><a href="HouseInfo.jsp">HouseInfo</a></li>
		<li id="sign" style="float: right;"><a href=""><%= request.getSession().getAttribute("email") %></a></li>

	</ul>
</header>
	
<img src="images/stockholm-snow.jpg" style="width: 100%; height: auto;" />
	

	

</body>
</html>


