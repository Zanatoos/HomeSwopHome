<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="design/design.css"> 
	<title>Personal Information</title>
</head>
<body>
	<div align="center"><img src="images/logo.png" style="width: 10%; height: auto;" />
    <h2>My Personal Information</h2>
	</div>




	<form name="myform">
    <table border = "1"  width="80%"  align="center">
        
        <tr>
            <td>E-mail</td>
            <td><%= request.getSession().getAttribute("email") %></td>    
        </tr>
        <tr>
            <td>Telephone</td>
            <td> <%= request.getSession().getAttribute("tel")  %></td>    

        </tr>
        <tr>
        	<td>First Name</td>
       	 	<td> <%= request.getSession().getAttribute("firstName")  %></td> 
        </tr>
        <tr>
        	<td>Last Name</td>
       	 	<td> <%= request.getSession().getAttribute("lastName")  %></td> 
        </tr>
        <tr>
        	<td>HouseId</td>
       	 	<td> <%= request.getSession().getAttribute("houseId")  %></td> 
        </tr>
        
     
    </table>
    </form>
    <br/>
    <br/>
   <div align="center">
   <a href="Sucess.jsp"><button type="button" style="width:10%;">Return</button></a>
   </div>

	
	
</body>
</html>