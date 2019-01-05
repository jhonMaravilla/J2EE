<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.prog32758.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<embed src="Sound/thinkMusic.mp3" autostart="true" loop="true" width="0"
	height="0">
<title>Sheridan Jeopardy</title>
<link rel="stylesheet" type="text/css" href="CSS/style3.css">
<link href="https://fonts.googleapis.com/css?family=Cabin"
	rel="stylesheet">
</head>
<body>
	<%
		NewPlayer player = (NewPlayer) session.getAttribute("player");
		if(request.getParameter("bet") != null)
		session.setAttribute("bet", request.getParameter("bet"));			
	%>
	<div id="container">
		<div id="header">
			<p>
				Player name:
				<%=player.getName()%>
				| Score:
				<%=player.getScore()%></p>
		</div>
		<div id="content">
		<% if(request.getAttribute("bet") != null){%>
			<p>
				<b> ${category} : $ ${bet} </b>
			</p>
			<% } else{ %>
			<p>
				<b> ${category} : $ ${value}</b>
			</p>
			<%} %>
			
			<br> <br>
			<form action="Answer" method="post">
				<center>
					<p>${catQuestion}</p>
					<br> <br>
					<section>

					<div>
						<input type="radio" id="control_01" name="select"
							value="${answer1}">  <label for="control_01"> <span>
								${answer1} </span>
						</label>
					</div>
					<div>
						<input type="radio" id="control_02" name="select"
							value="${answer2}"> <label for="control_02"> <span>
								${answer2} </span>
						</label>
					</div>
					<div>
						<input type="radio" id="control_03" name="select"
							value="${answer3}"> <label for="control_03"> <span>
								${answer3} </span>
						</label>
					</div>
					<div>
						<input type="radio" id="control_04" name="select"
							value="${answer4}"> <label for="control_04"> <span>
								${answer4} </span>
						</label>
					</div>
					</section>
					</center>
					<button type="submit" style="border: 0; background: transparent;" id="rightFloat">
						<img src="Images/submit.png"/>
					</button>
					
					<button type="submit" formaction="GameBoard.jsp" style="border: 0; background: transparent;" id="leftFloat">
						<img src="Images/back.png"/>
					</button>

			</form>
		</div>
	</div>
</body>
</html>