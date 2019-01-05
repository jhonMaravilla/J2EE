<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.prog32758.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<embed src="Sound/BonusSound.mp3" autostart="true" loop="false"
	width="0" height="0">
<title>Sheridan Jeopardy</title>
<link rel="stylesheet" type="text/css" href="CSS/style.css">
<link href="https://fonts.googleapis.com/css?family=Cabin"
	rel="stylesheet">
</head>

<body>
	<%
		NewPlayer player = (NewPlayer) session.getAttribute("player");

	%>
	<div id="container">
		<div id="header">
			<p>
				Player name:
				<%=player.getName()%>
				| Score:
				<%=player.getScore()%>
			</p>
		</div>
		<div id="content2">
			<p>
				<b> <img src="Images/bonus.png">
				</b>
			</p>
			<br> <br> <br> <br>
			<form method="post" action="CheckBet">
				<center>
					<table class="questionTable">
						<tr>
							<th><input type="text" name="bet"
								placeholder="Enter your bet" class="name" id="name" autofocus
								></th>
						</tr>
					</table>
					<% if (request.getAttribute("invalid") != null) {%>
					
					<span id="invalid"> ${invalid} 
					</span>
					<%}%>
				</center>
				<button type="submit" style="border: 0; background: transparent;"
					id="rightFloat">
					<img src="Images/bet.png" />
				</button>

				<button type="submit" formaction="GameBoard.jsp"
					style="border: 0; background: transparent;" id="leftFloat">
					<img src="Images/back.png" />
				</button>
			</form>
		</div>
	</div>
</body>


</html>