<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="https://fonts.googleapis.com/css?family=Trirong" rel="stylesheet">
	<link rel="icon" type="image/ico" href="Photos/logo.png" />
	<title>Knight's Tour</title>
	<style>
	*{
		margin : 0;
		padding: 0;
	}
	
	body{
		font-family: 'Trirong', serif;
		background-image:url("Photos/chessBg.jpg");
		background-repeat: no-repeat;
		background-size: cover;
		width: 100%;
		height: 100%;
	}
	
	#content{
		height: 100%;
		width: 50%;
		margin:0 auto;
		color: white;
		font-size: 20px;
	}
	
	#menu{
		margin: 15% auto;
	    width: 90%;
	    padding: 0;
	    margin-bottom: 125px;
	}
	
	#menu td{
	    width: 29%;
   	 	padding: 10px;
	}
	
	
	.halfWidth{
    width: 15%;
    height: 30px;
    border-radius: 4px;
	}
	
	.halfWidth:hover {
		font-weight: bold;
	}
	
	.fullWidth{
    width: 290px;
    height: 10%;
    text-align:center;
	}
	
	.position{
		text-align:center;
		width: 40%;
	}
	.position2{
	text-align:center;
		width: 45%;
	}
	
	::-webkit-input-placeholder {
  	color: red;
  	opacity: 0.5;
  	text-align: center;
	}
	
	</style>
	</head>
	<body>
		<div id="content">
			<center>
			<form action="playMode.jsp">
				<table id="menu">
					<tr>
						<th colspan="3"> Knight's Tour </th>
					</tr>
					<tr>
						<td> Select Mode:	</td>
						<td> <input type="radio" name="mode" value="2" required> Intelligent	</td>
						<td> <input type="radio" name="mode" value="1" required> Non-Intelligent	</td>
					</tr>
					<tr>
						<td> No. of Tries: </td>
						<td> <input type="text" name="tries" class="fullWidth" required>  </td>
					</tr>
					<tr>
						<td> Position: </td>
						<td>  <input type="text" name="positionX" class="position" placeholder="Row Position" required> &nbsp; &nbsp; 
							  <input type="text" name="positionY" class="position2" placeholder="Column Position" required> </td>
					</tr>
					<tr>
						<th colspan="3"> <input type="submit" value="Play" class="halfWidth"> </th>
					</tr>
				</table>
			</center>
			</form>
		</div>
	</body>
</html>