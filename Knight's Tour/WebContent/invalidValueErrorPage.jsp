<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" type="image/ico" href="Photos/logo.png" />
<title>Knight's Tour</title>
<style>
body {
	font-family: 'Trirong', serif;
	color: white;
	background-image: url("Photos/resultBg2.png");
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>

<body>

<center>
<font color="red">
<h3> Error: <%= exception.getMessage() %> </h3> 
</font>
</br>
</center>

</body>
</html>